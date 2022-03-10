public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area(){
          return length*width;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(5,8);

        System.out.println("Rectangle1 = "+rectangle1.area());
        System.out.println("Rectangle2 = "+rectangle2.area());
    }

}

