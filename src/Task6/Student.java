package Task6;

public class Student {

    Student(int N, String Name, String Surname, int Year, double Math_mark, double Economic_mark, double Eng_mark) {
        n = N; // номер билета
        name = Name;
        surname = Surname;
        year = Year;
        math_mark = Math_mark;
        economic_mark = Economic_mark;
        eng_mark = Eng_mark;
    }

    Student(int N, String Name, String Surname, int Year) {
        this(N, Name, Surname, Year, 0.0, 0.0, 0.0);
    }

    Student() {
        this(0, null, null, 0, 0.0, 0.0, 0.0);
    }

    int n; // номер билета
    String name;
    String surname;
    int year;
    double math_mark;
    double economic_mark;
    double eng_mark;


}

class StudentTest {
    public static void main(String[] args) {
        Student a = new Student();
        System.out.println(a.name);


    }

}