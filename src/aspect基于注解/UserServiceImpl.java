package aspect基于注解;

import org.springframework.stereotype.Service;

/**
 * Created by john on 2016/10/26.
 */
@Service("UserServiceImpl2")
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
//        int i = 1 / 0;
        System.out.println("add user in aspect基于注解 ");
    }
}
