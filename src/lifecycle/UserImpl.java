package lifecycle;

import org.springframework.context.annotation.Scope;

/**
 * Created by john on 2016/10/25.
 */
@Scope("prototype")
public class UserImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("add user  lifeCycle");
    }

    public void myInit() {
        System.out.println("我的初始化 方法");
    }

    public void myDestory() {
        System.out.println("我的销毁方法");
    }
}
