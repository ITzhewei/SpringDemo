package jdbc.c3p0;

import jdbc.doamin.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by john on 2016/10/27.
 */
public class Test {

    @org.junit.Test
    public void DT() {
        User user = new User();
        user.setId(2);
        user.setUsername("麦");
        user.setPassword("2222");

        String path = "jdbc/c3p0/beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);
        UserDao userDao1 = (UserDao) context.getBean("UserDao2");

        userDao1.update(user);
    }

}
