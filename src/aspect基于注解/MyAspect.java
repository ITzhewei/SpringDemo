package aspect基于注解;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by john on 2016/10/27.
 * 这是切面类,含有多个通知
 */
@Component
@Aspect//声明切面
public class MyAspect {

    @Pointcut("execution(* aspect基于注解.*.*(..))")
    public void myPointCut() {
    }

    //    前置方法
//    @Before(value = "myPointCut()")
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("我的 前置方法 ");
    }

    //    后置方法
//    @AfterReturning(value = "myPointCut()", returning = "o")
    public void myAfter(JoinPoint joinPoint, Object o) {
        System.out.println("我的 后置 方法" + o);
    }


    //    我的环绕方法
//    @Around("myPointCut()")
    public Object myaround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("我的 环绕前 方法 ");
        Object proceed = joinPoint.proceed();
        System.out.println("我的 环绕后 方法");
        return proceed;
    }

    //我的抛出异常的通知
//    @AfterThrowing(value = "myPointCut()", throwing = "throwable")
    public void myafterThrowing(JoinPoint joinPoint, Throwable throwable) {
        System.out.println("抛出异常通知" + throwable.toString());
    }

    //我的最终通知方法--->相当于finally()
    @After("myPointCut()")
    public void myAfter() {
        System.out.println("我的 after 方法");
    }
}
