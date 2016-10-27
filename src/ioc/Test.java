package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by john on 2016/10/25.
 */

public class Test {

    @org.junit.Test
    public void Demo1() {
        /*UserService userService = new UserImpl();
        userService.addUser();*/
        String path = "ioc/applicationContext.xml";
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext(path);
        UserService userService= (UserService) applicationContext.getBean("userServiceId");
        userService.addUser();

    }
}
