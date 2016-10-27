package lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by john on 2016/10/25.
 */
public class MyBeanPost implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("前方法");
        return o;
    }


    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("后方法");
        return Proxy.newProxyInstance(MyBeanPost.class.getClassLoader()
                , o.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("开启事物");

                        //执行目标方法

                        Object invoke = method.invoke(o, args);
                        System.out.println("事物结束");
                        return invoke;
                    }
                });
    }
}
