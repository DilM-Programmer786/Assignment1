public class Student_2 {
    private String name;
    private int roll_no;
    private String phoneNo;
    private String address;

    public Student_2(String name,int roll_no, String phoneNo,  String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phoneNo = phoneNo;
        this.address = address;
    }


    public static void main(String[] args) {
        Student_2 student2 = new Student_2("Sam", 3, "0301-111123-5", "Lahore");
        Student_2 student3 = new Student_2("John", 4, "0301-111123-5", "Karachi");
    }
}
