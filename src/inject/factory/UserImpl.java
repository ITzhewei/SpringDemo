package inject.factory;

/**
 * Created by john on 2016/10/25.
 */
public class UserImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("add user  factory");
    }
}
