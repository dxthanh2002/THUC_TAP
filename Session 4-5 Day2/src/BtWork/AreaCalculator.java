package BtWork;

public class AreaCalculator {
    public static double area(double radius){
        if(radius <0){
            double s = -1;
            return s;
        }
        double s = radius * radius * Math.PI;
        return s;
    }
    public static double area(double x,double y) {
        double a = -1;
        if (x < 0) {
            return a;
        }
        if (y < 0) {
            return a;
        }
        double b = x * y;
        return b;
    }}
