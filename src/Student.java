public class Student {
    public String name;
    public int roll_no;

    public Student(String name,int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }


    public static void main(String[] args) {
        Student student1 = new Student("John", 2);
    }
}
