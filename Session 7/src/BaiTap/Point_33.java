package BaiTap;

public class Point_33 {
    private int x;
    private int y;

    //
    public Point_33() {
        this.x = 0;
        this.y = 0;
    }

    //
    public Point_33(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Kc đến gốc tọa độ
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Kc đến điểm kia bằng point
    public double distance(Point_33 other) {
        return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
    }

    // kc đến điểm kia bằng tọa độ
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
    }
    // tổng của bình phương hiệu
    public static void main(String[] args) {
        Point_33 first = new Point_33(6, 5);
        Point_33 second = new Point_33(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point_33 point = new Point_33();
        System.out.println("distance()= " + point.distance());
    }
}
