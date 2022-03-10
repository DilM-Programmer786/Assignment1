import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex sum(Complex other) {
        double r = this.real + other.real;
        double i = this.imaginary + other.imaginary;
        return new Complex(r, i);
    }
    public Complex difference(Complex other) {
        double r = this.real - other.real;
        double i = this.imaginary - other.imaginary;
        return new Complex(r, i);
    }

    public Complex multiplication(Complex b) {
        double real = this.real * b.real - this.imaginary * b.imaginary;
        double img = this.real * b.imaginary + this.imaginary * b.real;
        return new Complex(real, img);
    }
    @Override public String toString() {
        return real + " + " + imaginary + "i";
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        Complex complexNumber1 = new Complex(sc.nextInt(), sc.nextInt());
        Complex complexNumber2 = new Complex(sc.nextInt(), sc.nextInt());

        Complex sum = complexNumber1.sum(complexNumber2);
        System.out.println("Sum: "+sum);
        Complex difference = complexNumber1.difference(complexNumber2);
        System.out.println("Difference: "+difference);
        Complex multiplication = complexNumber1.multiplication(complexNumber2);
        System.out.println("Multipliccation: "+multiplication);



    }

}
