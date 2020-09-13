package StreamStudy;
import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length <= s2.getBytes().length)
            return s1;
        else return s2; }
    }

public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"HELLO", "AMOR", "NICE TO MEET YOU", "Good To See you"};
        //Arrays.stream()을 통해 스트림 생성
        System.out.println(Arrays.stream(greetings).reduce("",(s1, s2) -> {
            if(s1.getBytes().length >= s2.getBytes().length)
                return s1;
            else return s2; }
            ));
        String s = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println(s);
    }
}
