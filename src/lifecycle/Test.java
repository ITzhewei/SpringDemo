package lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by john on 2016/10/25.
 */

public class Test {

    @org.junit.Test
    public void Demo1() throws Exception {
        String path = "lifecycle/applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        UserService userService = (UserService) applicationContext.getBean("userServiceId");

        userService.addUser();

        applicationContext.close();

    }
}
