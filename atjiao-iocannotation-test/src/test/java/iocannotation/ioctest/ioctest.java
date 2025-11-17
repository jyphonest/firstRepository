package iocannotation.ioctest;

import com.atjiao.XxxController;
import com.atjiao.XxxDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ioctest {
    @Test
    public void iocannotationtest(){
        //创建ioc容器
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("atjiao-iocannotationxml-test.xml");
        //获取Bean组件
        XxxController bean = context.getBean(XxxController.class);
        bean.testshow();
        //close
        context.close();
    }
}