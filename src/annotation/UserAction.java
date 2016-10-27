package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by john on 2016/10/26.
 */
@Controller("userAction")
public class UserAction {

    @Autowired
    private UserImpl user;

    public void executed() {
        user.addUser();
    }

    //初始化
    @PostConstruct
    public void init(){

    }

    //销毁
    @PreDestroy
    public void destory(){

    }
}
