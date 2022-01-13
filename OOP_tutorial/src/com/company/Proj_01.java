package com.company;

class Cylinder{
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int radius;
    private int height;
}
public class Proj_01 {
    //proj 1
    public static void main(String[] args) {
        Cylinder mycylinder = new Cylinder();
        mycylinder.setHeight(12);
        //mycylinder.getHeight(23);

    }
}
