package aspectJ基于XML;

import org.springframework.stereotype.Service;

/**
 * Created by john on 2016/10/26.
 */
@Service("UserServiceImpl1")
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("add user in aspect基于注解 基于 XML");
    }
}
