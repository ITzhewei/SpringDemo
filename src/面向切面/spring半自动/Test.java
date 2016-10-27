package 面向切面.spring半自动;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by john on 2016/10/26.
 */
public class Test {

    @org.junit.Test
    public void Demo1(){
        String path = "面向切面/spring半自动/beans.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(path);
        UserService userServiceImpl = (UserService) context.getBean("proxyServiceId");
        userServiceImpl.addUser();
    }
}
