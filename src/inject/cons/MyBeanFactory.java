package inject.cons;


/**
 * Created by john on 2016/10/25.
 */
public class MyBeanFactory {
    public static UserService createService() {
        return new UserImpl();
    }
}
