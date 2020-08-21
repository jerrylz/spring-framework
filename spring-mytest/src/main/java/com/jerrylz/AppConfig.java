package com.jerrylz;

import com.jerrylz.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jerrylz
 * @date 2020/8/7
 */
@Configuration
@ComponentScan
public class AppConfig {

	@Bean("user")
	public User createUser(){
		return new User("ylz", 33);
	}
}
