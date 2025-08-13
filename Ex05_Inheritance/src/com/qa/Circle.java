package com.qa;

public class Circle extends Shape {
    private double radius;

    public Circle(String name, String colour, double x, double y, double radius) {
        super(name, colour, x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                super.toString() +
                '}';
    }

    @Override
    public double getArea(){
        return (Math.PI*(radius*radius));
    }

    @Override
    public Point getCentrePoint(){
        double xPoint = getX();
        double yPoint = getY();
        double xCentre = xPoint + (radius/2);
        double yCentre = yPoint + (radius/2);

        return new Point (xCentre, yCentre);
    }

}
