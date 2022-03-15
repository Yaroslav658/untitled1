package Package2;

public class Car {
        String color = "red";

    }
    class work {
        public static void main(String[] args) {
            Car car1 = new Car();
            Car car2 = car1;
            car2.color = "green";
        }

    }

