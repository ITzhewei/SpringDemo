package inject.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by john on 2016/10/25.
 */

public class Test {

    @org.junit.Test
    public void Demo1() {

        String path = "inject/factory/applicationContext.xml";
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext(path);
        UserService userService= (UserService) applicationContext.getBean("userService");
        userService.addUser();


    }
}
