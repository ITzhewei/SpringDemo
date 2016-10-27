package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by john on 2016/10/25.
 */
public class Test {

    @org.junit.Test
    public void Demo2() {
        String path = "di/bean.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(path);
        BookService bookService= (BookService) context.getBean("bookService");
        bookService.addBook();
    }
}
