package com.tugang.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//import com.tugang.domain.Attachment;
//import com.tugang.service.AttachmentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-*.xml")
public class Demo {
//	@Autowired
//	private AttachmentService attachmentService;
	
	@Test
	public void fun(){
//		Attachment attachment = attachmentService.getById("123");
//		System.out.println(attachment);
	}
}
