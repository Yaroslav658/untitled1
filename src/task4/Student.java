package task4;


public class Student {


    int n; // номер билета
    String name;
    String surname;
    int year;
    double math_mark;
    double economic_mark;
    double eng_mark;




}

class StudentTest {

    double srMark(Student st){
        return (st.math_mark+st.economic_mark+st.eng_mark)/3;
    }


    public static void main(String[] args) {
        Student student1 = new Student();
        student1.n = 1;
        student1.name = "Oleg";
        student1.surname = "Olegov";
        student1.year = 2010;
        student1.math_mark = 4.3;
        student1.economic_mark = 5.2;
        student1.eng_mark = 4.9;

        Student student2 = new Student();
        student2.n = 2;
        student2.name = "Oleg2";
        student2.surname = "Olegov2";
        student2.year = 2009;
        student2.math_mark = 2.3;
        student2.economic_mark = 3.7;
        student2.eng_mark = 2.6;


        Student student3 = new Student();
        student3.n = 3;
        student3.name = "Oleg3";
        student3.surname = "Olegov3";
        student3.year = 2012;
        student3.math_mark = 4.4f;
        student3.economic_mark = 3.2f;
        student3.eng_mark = 3.9f;

        StudentTest k = new StudentTest();
        System.out.println("Средняя оценка 1го студента: "+k.srMark(student1));
        System.out.println("Средняя оценка 2го студента: "+k.srMark(student2));
        System.out.println("Средняя оценка 3го студента: "+k.srMark(student3));
    }



}
