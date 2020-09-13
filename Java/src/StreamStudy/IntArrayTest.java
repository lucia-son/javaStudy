package StreamStudy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        //스트림 연산을 사용하려면 스트림 재생성 필요
        int count = (int)Arrays.stream(arr).count();
        System.out.println(count);
    }
}
