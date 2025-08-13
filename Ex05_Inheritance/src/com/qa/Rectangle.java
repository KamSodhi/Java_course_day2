package com.qa;

public class Rectangle extends Shape {

    private double height, width;

    public Rectangle(String name, String colour, double x, double y, double height, double width) {
        super(name, colour, x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                super.toString() +
                '}';
    }

    public boolean isSquare()
    {
        if(height == width) {
            return true;
        }
        else
            return false;
    }

    @Override
    public double getArea(){
        return width*height;
    }

    @Override public Point getCentrePoint(){
        double xPoint = getX();
        double yPoint = getY();
        double xCentre = xPoint + (width/2);
        double yCentre = yPoint + (height/2);

        return new Point (xCentre, yCentre);

    }
}
