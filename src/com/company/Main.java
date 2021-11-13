package com.company;

import java.nio.channels.Pipe;

public class Main {

    public static void main(String[] args) {

        Point A = new Point();
        Point B = new Point(3,4);
        Point C = new Point(4,6);

        Triangle ABC = new Triangle(A,B,C);
        System.out.println(ABC.getP());
        System.out.println(ABC.toString());
    }
}
