package 面向切面.手动代理用JDK;

/**
 * Created by john on 2016/10/26.
 */
public class Myaspect {

    public void before(){
        System.out.println("鸡首");
    }
    public void after(){
        System.out.println("牛后");
    }
}
