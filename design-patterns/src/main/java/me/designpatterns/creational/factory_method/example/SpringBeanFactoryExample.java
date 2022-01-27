package me.designpatterns.creational.factory_method.example;

// import org.apache.naming.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactoryExample {

    public static void main(String[] args) {
        // BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml"); // 에러 발생
        ApplicationContext xmlFactory = new ClassPathXmlApplicationContext("config.xml");
        String hello = xmlFactory.getBean("hello", String.class);
        System.out.println(hello);


        ApplicationContext javaFactory = new AnnotationConfigApplicationContext(Config.class);
        String hi = javaFactory.getBean("hello", String.class);
        System.out.println(hi);

        ((ClassPathXmlApplicationContext) xmlFactory).close();
        ((AnnotationConfigApplicationContext) javaFactory).close();
    }
}
