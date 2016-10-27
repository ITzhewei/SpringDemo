package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by john on 2016/10/25.
 */

public class Test {

    @org.junit.Test
    public void Demo1() {
        String path = "annotation/applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        UserAction userAction = (UserAction) applicationContext.getBean("userAction");
        userAction.executed();


    }
}
