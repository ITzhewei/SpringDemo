package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by john on 2016/10/25.
 */

public class Test {

    @org.junit.Test
    public void Demo1() {
        String path = "scope/applicationContext.xml";
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext(path);
        UserService userService= (UserService) applicationContext.getBean("userServiceId");
        UserService userService2= (UserService) applicationContext.getBean("userServiceId");

        System.out.println(userService);
        System.out.println(userService2);
    }
}
