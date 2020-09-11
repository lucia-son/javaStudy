package interfaceStudy;

public interface Calc {

    //따로 작성하지 않아도 (public static final) double PI = 3.14;
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description() {
        System.out.println("Calculator");
    }
    static int total(int [] arr) {
        int total = 0;
        for(int i : arr) {
            total += i;
        }
        return total;
    }
}

