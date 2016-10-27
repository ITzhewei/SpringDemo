package 面向切面.手动代理用JDK;

/**
 * Created by john on 2016/10/26.
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("add user in  面向切面");
    }
}
