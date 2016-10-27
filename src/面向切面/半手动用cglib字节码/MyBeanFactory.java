package 面向切面.半手动用cglib字节码;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by john on 2016/10/26.
 */
public class MyBeanFactory {

    public static UserServiceImpl createService() {
        //1.目标类
        UserServiceImpl userService = new UserServiceImpl();
        //2.切面类
        Myaspect myaspect = new Myaspect();

        //3.代理类
        //3.1核心类
        Enhancer enhancer = new Enhancer();

        enhancer.setSuperclass(userService.getClass());

        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                myaspect.before();
                //执行目标类
                Object invoke = method.invoke(userService, objects);
                //执行代理类的父类的方法
                methodProxy.invokeSuper(o,objects);
                myaspect.after();
                return invoke;
            }
        });

        UserServiceImpl proxyService = (UserServiceImpl) enhancer.create();

        return proxyService;

    }
}
