public class Triangle_2 {
    private int side;
    private int base;
    private int height;

    public Triangle_2(int side, int base, int height) {
        this.side = side;
        this.base = base;
        this.height = height;
    }

    public double area(){
        return ((float)(1/2) * base * height);
    }

    public double perimeter(){
        return side+height+base;
    }

    public static void main(String[] args) {
        Triangle_2 triangle2 = new Triangle_2(3,4,5);
        System.out.println("Area: "+ triangle2.area());
        System.out.println("Perimeter"+ triangle2.perimeter());
    }

}
