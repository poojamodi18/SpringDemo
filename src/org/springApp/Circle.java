package org.springApp;
//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class Circle implements Shape {
    private Point center;

    public Point getCenter() {
        return center;
    }
    @Required
    @Resource
    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public void draw() {
        System.out.println("Circle point is : "+getCenter());
    }
}
