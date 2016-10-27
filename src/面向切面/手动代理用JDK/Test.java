package 面向切面.手动代理用JDK;

/**
 * Created by john on 2016/10/26.
 * JDK  的动态代理
 */
public class Test {

    @org.junit.Test
    public void Demo1(){
        UserService service = MyBeanFactory.createService();
        service.addUser();
    }
}
