package com.haybook;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

/**
 * Created by Albert.sepian on 12/14/2017.
 */
@Component
public class DbConnectionImpl implements DbConnection {
    @Override
    public void close(String URL) {
        System.out.println(URL);}
        @PreDestroy
                public void destroy() {
        System.out.println("jana");
        }
}
