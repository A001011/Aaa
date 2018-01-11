package com.haybook;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import java.util.List;

@SpringBootApplication

public class HaybookApplicationImpl implements ApplicationContextAware {
    @Autowired
    UserRepository userRepository;
    private ApplicationContext applicationContext;

    @PostConstruct
    void startup() {

        System.out.println("starto");
        DbConnectionImpl dbConnection = applicationContext.getBean(DbConnectionImpl.class);
        dbConnection.close("SURL");
        System.out.println(dbConnection);

        User u = new User();
        userRepository.create(u);

        User u1 = userRepository.getbyid(0);
        System.out.println(u1);
    }


    public static void main(String[] args) {
        SpringApplication.run(HaybookApplicationImpl.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    public int sum(int a,int b){
        return a + b;
    }
    public List<Integer> findDuplicates(List<Integer> a, List<Integer> b){
       if (a == null){
           throw new IllegalArgumentException();
       }else if (b == null){
           throw new IllegalArgumentException();
       }
       return null;
    }
}

