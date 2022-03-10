public class Triangle {
    public int side;
    public int height;
    public int base;

    public double area(){
         return (((float)1/2)*base*height);
    }

    public double perimeter(){
             return side+height+base;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.side = 3;
        triangle.base = 4;
        triangle.height = 5;

        System.out.println("Area: "+triangle.area());
        System.out.println("Perimeter: "+triangle.perimeter());
    }
}
