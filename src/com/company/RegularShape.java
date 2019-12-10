package com.company;

public interface RegularShape {

    double getArea();
    double getCircumference();
    default void print()
    {
        String name = getClass().getSimpleName();
        double circ = getCircumference();
        double area = getArea();

        System.out.printf("%8s [circ. = %5.2f, area = %5.2f]%n",
                name, circ, area);
    }
    static void printInfo(RegularShape[] shapes)
    {
        for (RegularShape shape: shapes) {
            shape.print();
        }
    }
}
