package com.tugang.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

public class EntityFieldUtil {
    /**
     * @Title: replaceNullToString 
     * @Description: ��entity��String���ͷ���ֵΪnull����Ϊ""
     */
	@Transactional(readOnly = true)
	public static <T> T replaceNullToString(T entity) {
		Class entityClass = (Class) entity.getClass();
		Method[] methods = entityClass.getMethods();// ��ȡ������������public����
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			int index = method.getReturnType().toString().indexOf("String");
			if (index > -1) {// �жϷ���������String
				String methodName = method.getName();// ������
				if (methodName.startsWith("get")) {// �ж�get����
					try {
						Object value = method.invoke(entity);// �õ�get������ֵ
						if (value == null) {// �ж�ֵΪ��
							String setMethodName = methodName.replace("get", "set");// set������
							Method setMethod = entityClass.getMethod(setMethodName, String.class);// set����
							setMethod.invoke(entity, "");// ����String����ֵΪ""
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
     * @Description: ��entitys��String���ͷ���ֵΪnull����Ϊ"" 
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
     * @Description: TODO(����get��set��������������)
     */
    public static String getFieldName(String methodName, String replace) {
        methodName = methodName.replace(replace, "");
        return methodName.substring(0, 1).toLowerCase() + methodName.substring(1);
    }

}
