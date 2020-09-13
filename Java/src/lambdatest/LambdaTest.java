package lambdatest;

import static lambdatest.LambdaTest.showMyString;

interface PrintString {
    void showString(String str);
}

public class LambdaTest {
    public static void main(String[] args) {
        PrintString lambdaPrint = str -> System.out.println(str);
        lambdaPrint.showString("PLANT");

        //매개변수로 들어온 람다식 사용하는 메서드 호출
        showMyString(lambdaPrint);

        //반환값이 람다식인 메서드 호출
        PrintString restr = returnPrint();
        restr.showString("PLANT3");
    }

    //람다식이 매개변수로 들어옴
    public static void showMyString(PrintString lambda){
        lambda.showString("PLANT2");
    }
    //반환값 전체가 람다식
    public static PrintString returnPrint() {
        return s -> System.out.println(s);
    }
}
