package atjiao.springioc;

import com.atjiao.configuration.JavaConfig;
import com.atjiao.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = {JavaConfig.class})
public class jdbctest {

    @Autowired
    private StudentController studentController;
    @Test
    public void controllertest(){

        //ApplicationContext接口声明的对象无法调用close()方法

        //使用配置类创建对象AnnotationConfigApplicationContext
        //AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);

        //StudentController bean = applicationContext.getBean(StudentController.class);

        //bean.findAll();
        studentController.findAll();
    }
}