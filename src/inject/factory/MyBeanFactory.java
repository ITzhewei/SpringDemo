package inject.factory;


/**
 * Created by john on 2016/10/25.
 * 实例工厂
 */
public class MyBeanFactory {
    public UserService createService() {
        return new UserImpl();
    }
}
