package com.company;

import java.awt.*;

public class Point {
    double x;
    double y;

    Point(){
        this.x = 0;
        this.y = 0;
    }

    Point(Point anotherPoint){
        this.x = anotherPoint.x;
        this.y = anotherPoint.y;
    }

    Point(double x, double y){
        this.x = x;
        this.y = y;

    }

    public void setColor(Color color){
        Color c = new Color(0,0,0);
    }

    public void move(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "Point(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }

    double distanseTo(Point anotherPoint){
        return Math.sqrt(x*x + y*y);
    }

    double distanseXTo(Point anotherPoint){
        return x;
    }

    double distanseYTo(Point anotherPoint){
        return y;
    }
}
