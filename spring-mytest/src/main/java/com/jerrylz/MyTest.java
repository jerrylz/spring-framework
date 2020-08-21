package com.jerrylz;

import com.jerrylz.AppConfig;
import com.jerrylz.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jerrylz
 * @date 2020/8/7
 */
public class MyTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User bean = context.getBean(User.class);
		System.out.println(bean.toString());
	}
}
