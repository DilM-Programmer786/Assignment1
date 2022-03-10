import java.util.Scanner;

public class Area {
    private double length;
    private double breadth;

    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea(){
        return this.length*this.breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        Area area = new Area();
        area.setDim(length, breadth);
        System.out.println("Area2:  "+area.getArea());
    }
}
