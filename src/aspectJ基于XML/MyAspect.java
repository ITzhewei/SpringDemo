package aspectJ基于XML;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Service;

/**
 * Created by john on 2016/10/27.
 * 这是切面类,含有多个通知
 */
@Service("MyAspect1")
public class MyAspect {

    //    前置方法
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("我的 前置方法 ");
    }

    //    后置方法
    public void myAfter(JoinPoint joinPoint, Object o) {
        System.out.println("我的 后置 方法" + o);
    }

    //    我的环绕方法
    public Object myaround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("我的 环绕前 方法 ");
        Object proceed = joinPoint.proceed();
        System.out.println("我的 环绕后 方法");
        return proceed;
    }

    //我的最终通知方法--->相当于finally()
    public void myAfter() {
        System.out.println("我的 after 方法");
    }
}
