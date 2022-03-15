package Task6;

public class overloadedSum {


    int Sum(int A, int B, int C, int D) {
        return A + B + C + D;
    }

    int Sum(int A, int B, int C) { return Sum(A, B, C, 0);  }

    int Sum(int A, int B) {
        return Sum(A, B, 0, 0);
    }

    int Sum(int A) {
        return Sum(A, 0, 0, 0);
    }

    int Sum() {
        return Sum(0, 0, 0, 0);
    }

}

class overloadedSumTest {

    public static void main(String[] args) {
        overloadedSum a = new overloadedSum();

        System.out.println("Sum= " + a.Sum(1, 434, 22, 22));


    }
}