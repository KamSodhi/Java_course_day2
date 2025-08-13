package com.qa;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle("rect1", "blue",2,2,4,6);
        System.out.println(rect1.toString());
        System.out.println(rect1.getArea());
        System.out.println(rect1.getCentrePoint());

        Circle circ1 = new Circle("circ1","pink",0,0,10);
        System.out.println(circ1.toString());
        System.out.println(circ1.getArea());
        System.out.println(circ1.getCentrePoint());
    }
}
