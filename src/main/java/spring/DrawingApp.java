package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Triangle
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();

        // Circle
        Circle circle = (Circle) context.getBean("circle");
        circle.draw();
    }

}
