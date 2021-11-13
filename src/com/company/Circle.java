package com.company;

import java.awt.*;

public class Circle extends Point{
    double radius;

    public Circle(Point center, double radius) {
        super(center.x, center.y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle( center=" + super.toString()+
                "; radius=" + radius +
                " )";
    }

    @Override
    public void move(double dx, double dy) {
        super.move(dx, dy);
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    double getSurface(){
        return radius*radius*Math.PI;
    }

    double getPerimetr(){
        return 2*radius*Math.PI;
    }

    double getDiametr(){
        return 2*radius;
    }
}
