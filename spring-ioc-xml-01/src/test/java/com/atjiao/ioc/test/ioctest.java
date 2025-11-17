package com.atjiao.ioc.test;

import com.atjiao.ioc3.HappyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ioctest {

    public void creatioc(){
        /*
         * 接口--->两大类
         * BeanFactory
         * ApplicationContext
         * */

        /*
         * 实现类四个
         * */
        ApplicationContext context  =new ClassPathXmlApplicationContext("atjiao-ioc-03.xml");
    }
    @Test
    public void getiocBean(){
        ClassPathXmlApplicationContext ApplicationContext =new ClassPathXmlApplicationContext();
        ApplicationContext.setConfigLocation("atjiao-ioc-03.xml");
        ApplicationContext.refresh();

        HappyComponent happyComponent2 =(HappyComponent)ApplicationContext.getBean("HappyComponent2");

        HappyComponent happyComponent3 = ApplicationContext.getBean("HappyComponent2", HappyComponent.class);

        HappyComponent happyComponent1 = ApplicationContext.getBean(HappyComponent.class);

        happyComponent1.doWork();

        System.out.println(happyComponent1 == happyComponent2 );
        System.out.println(happyComponent2 == happyComponent3 );

    }
}