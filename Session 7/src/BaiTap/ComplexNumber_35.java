package BaiTap;

public class ComplexNumber_35 {
    private double real;
    private double imaginary;

    // Constructor
    public ComplexNumber_35(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter for real part
    public double getReal() {
        return real;
    }

    // Getter for imaginary part
    public double getImaginary() {
        return imaginary;
    }

    // Add method with real and imaginary parameters
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    // Add method with another ComplexNumber
    public void add(ComplexNumber_35 other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    // Subtract method with real and imaginary parameters
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    // Subtract method with another ComplexNumber
    public void subtract(ComplexNumber_35 other) {
        this.real -= other.real;
        this.imaginary -= other.imaginary;
    }

    // Main method for testing
    public static void main(String[] args) {
        ComplexNumber_35 c1 = new ComplexNumber_35(5.0, 3.0);
        ComplexNumber_35 c2 = new ComplexNumber_35(4.0, 2.0);

        c1.add(c2);
        System.out.println("After addition: " + c1.getReal() + " + " + c1.getImaginary() + "i");

        c1.subtract(4.0, 2.0);
        System.out.println("After subtraction: " + c1.getReal() + " + " + c1.getImaginary() + "i");
    }
}

