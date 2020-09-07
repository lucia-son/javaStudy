package ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        //int 배열
        int [] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 1;
        }
        for (int number : numbers)
            System.out.println(number);

        //String 배열
        String [] students = new String [] {"han", "joo", "sol"};
        for (String student : students) // for로 반복 명령문이 하나인 경우 중괄호 필요 x
            System.out.println(student);

        //double 배열
        double[] num = new double[5];
        int size = 0;
        double total = 1.0;

        num[0] = 10.0; size++;
        num[1] = 20.0; size++;
        num[2] = 30.0; size++;

        for(int i = 0; i < size; i++ ) {
            System.out.println(num[i]);
            total *= num[i]; //total 변수에 값을 곱하는 것이기 때문에 초기화값 필요
            System.out.println(total);
        }
    }

    }

