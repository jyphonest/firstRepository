package com.atjiao.ioc.test.iocinitclose;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    @Test
    public void iocinitclosetest(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("atjiao-ioc-o4.xml");

        applicationContext.close();

    }
}