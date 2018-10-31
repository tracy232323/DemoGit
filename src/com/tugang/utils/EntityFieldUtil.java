package com.tugang.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class EntityFieldUtil {
    /**
     * @Title: replaceNullToString 
     * @Description: 将entity内String类型返回值为null更改为""
     */
	@Transactional(readOnly = true)
	public static <T> T replaceNullToString(T entity) {
		Class entityClass = (Class) entity.getClass();
		Method[] methods = entityClass.getMethods();// 获取包括父类所有public方法
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			int index = method.getReturnType().toString().indexOf("String");
			if (index > -1) {// 判断返回类型是String
				String methodName = method.getName();// 方法名
				if (methodName.startsWith("get")) {// 判断get方法
					try {
						Object value = method.invoke(entity);// 得到get方法的值
						if (value == null) {// 判断值为空
							String setMethodName = methodName.replace("get", "set");// set方法名
							Method setMethod = entityClass.getMethod(setMethodName, String.class);// set方法
							setMethod.invoke(entity, "");// 设置String类型值为""
						}
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} catch (NoSuchMethodException e) {
						e.printStackTrace();
					} catch (SecurityException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return entity;
	}

    /**
     * @Title: replaceNullToString 
     * @Description: 将entitys内String类型返回值为null更改为"" 
     */
    public static <T>  List<T> replaceNullToString(List<T> entitys) {
        List<T> newList = new ArrayList<T>();
        for (T t : entitys) {
            newList.add(replaceNullToString(t));
        }
        return newList;
    }

    /**
     * @Title: getFieldName
     * @Description: TODO(根据get或set方法返回属性名)
     */
    public static String getFieldName(String methodName, String replace) {
        methodName = methodName.replace(replace, "");
        return methodName.substring(0, 1).toLowerCase() + methodName.substring(1);
    }

}
