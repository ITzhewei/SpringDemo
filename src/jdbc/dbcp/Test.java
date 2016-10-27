package jdbc.dbcp;

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
        user.setId(1);
        user.setUsername("接客骚");
        user.setPassword("8888888");

        String path = "jdbc/dbcp/beans.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);
        UserDao userDao1 = (UserDao) context.getBean("UserDao1");

        userDao1.update(user);
    }

}
