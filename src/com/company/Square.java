package com.company;

import java.awt.*;

public class Square extends Point{
    double edgeX;
    double edgeY;
    public Square(Point v, double edge) {
        super(v.x, v.y);
        this.edgeX = v.x + edge;
        this.edgeY = v.y + edge;
    }



    public String toString() {
        return "Square(edge= " + edgeX + " )";
    }


    public void move(double dx, double dy) {
        super.move(dx, dy);
    }


    public void setColor(Color color) {
        super.setColor(color);
    }


    public double getSurface() {
        return edgeX*edgeX;
    }


    public double getPerimeter() {
        return edgeX*4;
    }
}
