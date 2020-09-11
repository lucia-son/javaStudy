package interfaceStudy;

public class CalcTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 2;
        Calc calc = new CompleteCalc();
        //타입 상속 .Calc 타입 에 CompleteCalc가 포함되어 있다
        System.out.println(calc.add(num1, num2));
        calc.description();

        int[] arr = {2,3,4,5};
        int sum = Calc.total(arr);
        System.out.println(sum);
    }
}
