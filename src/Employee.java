public class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return   name + '\t' +
                 yearOfJoining+'\t' +
                 address;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Hassan", 2009, 150000,"Lahore");
        Employee employee2 = new Employee("Ali", 2013, 150000,"karachi");
        Employee employee3 = new Employee("Suleman", 2010, 150000,"Peshawar");
        System.out.printf("Name\t"+"Year oF Joining\t"+"Address");
        System.out.printf("\n%s\t\n%s\t\n%s\n",employee1,employee2,employee3);
    }
}
