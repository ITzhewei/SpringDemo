package 面向切面.spring全自动;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Service;

/**
 * Created by john on 2016/10/26.
 * 切面类中确定通知规范 ,需要实现接口
 */
@Service("MyaspectId")
public class Myaspect implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        //前
        System.out.println("前");

        //手动执行目标方法
        Object proceed = methodInvocation.proceed();

        //后
        System.out.println("后");
        return proceed;
    }
}
