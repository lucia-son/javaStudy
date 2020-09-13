package lambdatest;

public class TestMyNumber {

    public static void main(String[] args) {
        //인터페이스를 implements 로 명시하지는 않음
        MyNumber maxNum = (x,y) -> (x >= y)? x:y; //구현부
        int max = maxNum.getMaxNumber(10,39);
        System.out.println(max);

        //내부적으로 익명함수가 생성됨
        MyNumber aaa = new MyNumber() {
            @Override
            public int getMaxNumber(int num1, int num2) {
                return 0;
            }
        };
    }

}
