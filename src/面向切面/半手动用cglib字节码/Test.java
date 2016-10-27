package 面向切面.半手动用cglib字节码;

/**
 * Created by john on 2016/10/26.
 */
public class Test {

    @org.junit.Test
    public void Demo1(){
        UserServiceImpl service = MyBeanFactory.createService();
        service.addUser();
    }
}
