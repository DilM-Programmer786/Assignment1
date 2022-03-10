import java.util.Scanner;

public class Area_2 {
    private double length;
    private double breadth;

    public Area_2(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea(){
        return length*breadth;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        Area_2 area2 = new Area_2(length, breadth);
        System.out.println("Area2:  "+area2.returnArea());
    }


}
