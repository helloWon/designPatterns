package me.designpatterns.creational.abstract_factory.java;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.designpatterns.creational.factory_method.after.Ship;

public class FactoryBeanExample {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
//        Ship whiteship = applicationContext.getBean("whiteship", Ship.class);
//        System.out.println(whiteship.getName());

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Ship bean = applicationContext.getBean(Ship.class);
        System.out.println(bean);
    }
}
