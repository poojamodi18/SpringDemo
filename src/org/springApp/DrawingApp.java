package org.springApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingApp {
    public static void main(String[] args) {
       /* Triangle triangle = new Triangle();   //normal java object instantiation
        triangle.draw();*/

        /*BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));       //beanFactory is deprecated
        Triangle triangle1 = (Triangle) factory.getBean("triangle");*/

        ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();

        PointTriangle pointTriangle = (PointTriangle) context.getBean("pointTriangle");
        pointTriangle.draw();

        //using alias name
        PointTriangle trianglePoint = (PointTriangle) context.getBean("trianglePoint");
        System.out.println("alias " + trianglePoint.getPointA());

        System.out.println("\nSquare points");
        Square square = (Square) context.getBean("square");
        square.drawSquare();

        Triangle chTriangle = (Triangle) context.getBean("childTriangle");
        chTriangle.draw();

        System.out.println();



    }
}
