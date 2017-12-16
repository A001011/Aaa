package com.haybook;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;

@SpringBootApplication

public class HaybookApplicationImpl implements ApplicationContextAware {
    private ApplicationContext applicationContext;

	@PostConstruct
  void startup(){

  	System.out.println("starto");
		DbConnectionImpl dbConnection = applicationContext.getBean(DbConnectionImpl.class);
		dbConnection.close("SURL");
		System.out.println(dbConnection);
	}

	public static void main(String[] args) {
		SpringApplication.run(HaybookApplicationImpl.class, args);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}

