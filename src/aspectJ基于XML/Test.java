package aspectJ基于XML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by john on 2016/10/26.
 */
public class Test {

    @org.junit.Test
    public void Demo1(){
        String path = "aspectJ基于XML/beans.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(path);
        UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl1");
        userServiceImpl.addUser();
    }
}
