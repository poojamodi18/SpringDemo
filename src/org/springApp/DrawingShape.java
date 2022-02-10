package org.springApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DrawingShape {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("springconfig.xml");
        Shape circle = (Circle) context.getBean("circle");
        circle.draw();
        System.out.println(context.getMessage("greeting",null,"default",null));
    }
}
