package 面向切面.spring全自动;

import org.springframework.stereotype.Service;

/**
 * Created by john on 2016/10/26.
 */
@Service("UserServiceImplId")
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("add user in  面向切面 全自动");
    }
}
