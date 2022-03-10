import java.util.Scanner;

public class Average {
    private int number1;
    private int number2;
    private int number3;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber3() {
        return number3;
    }

    public void setNumber3(int number3) {
        this.number3 = number3;
    }

    public double calculateAverage(){
        double result = (this.number1+this.number2+this.number3)/3;
        return result;
    }

    public static void main(String[] args) {
        Average average = new Average();
        Scanner sc = new Scanner(System.in);
        average.setNumber1(sc.nextInt());
        average.setNumber2(sc.nextInt());
        average.setNumber3(sc.nextInt());

        System.out.println("Average: "+average.calculateAverage());

    }

}
