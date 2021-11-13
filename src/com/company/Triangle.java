package com.company;


import java.awt.*;

public class Triangle extends Point{

    double side1;
    double side2;
    double side3;
    double P;


    public Triangle(Point v1,Point v2,Point v3) {
        super();
        side1 = Math.abs(Math.sqrt((v2.x-v1.x)*(v2.x-v1.x)+(v2.y-v1.y)*(v2.y-v1.y)));
        side2 = Math.abs(Math.sqrt((v3.x-v2.x)*(v3.x-v2.x)+(v3.y-v2.y)*(v3.y-v2.y)));
        side3 = Math.abs(Math.sqrt((v1.x-v3.x)*(v1.x-v3.x)+(v1.y-v3.y)*(v1.y-v3.y)));
        this.P = side1+side2+side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
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
        double p =P/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    public double getPerimeter() {
        return side1+side2+side3;
    }

    public boolean Isoceles() {
        if (side1 == side2) {
            return true;
        } else if (side1 == side3) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEquilatral(){
        if ((side3 + side1 + side2) == 3*side2) {
            return true;
        } else {
            return false;
        }
    }

    boolean isRectangle(){
        double max = Math.max(Math.max(side1,side2),side3);
        double min = Math.min(Math.min(side1,side2),side3);
        if (max*max == min*min + (P-max-min)*(P-max-min)){
            return true;
        } else{
            return false;
        }
    }

    public double getP() {
        return P;
    }
}
