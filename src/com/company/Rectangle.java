package com.company;

import java.awt.*;

public class Rectangle extends  Square{
    double edgeX;
    double edgeY;

    Rectangle(Point v, double edgeX , double edgeY){
        super(v, edgeX);
        this.edgeX = v.x + edgeX;
        this.edgeY = v.y + edgeY;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "edgeX=" + edgeX +
                ", edgeY=" + edgeY +
                '}';
    }

    @Override
    public void move(double dx, double dy) {
        super.move(dx, dy);
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    public double getSurface(){
        return edgeX*edgeY;
    }

    public double getPerimeter(){
        return 2*(edgeX+edgeY);
    }
}
