package Task5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    int department;

    Employee( int Id, String Surname, int Age, double Salary, int Department) {
         id = Id;
         surname = Surname;
         age = Age;
         salary = Salary;
         department = Department;

    }

    double salaryx() {
        salary = salary * 2;
        return salary;
    }
    double salaryy() {
        salary = salary / 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee a = new Employee(1,"qwe",20,20,2);
        System.out.println(a.salaryx());

        Employee b = new Employee(2,"qwe2",30,30,1);
        System.out.println(b.salaryy());
    }
}