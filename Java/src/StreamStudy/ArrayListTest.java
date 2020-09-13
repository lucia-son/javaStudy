package StreamStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {
        //List가 ArrayList보다 상위
        List<String> sList = new ArrayList<String>();
        sList.add("Tomas");
        sList.add("Doris");
        sList.add("Chicks");
        sList.add("Kelly");

        Stream<String> stream = sList.stream();
        stream.forEach(s-> System.out.println(s)); //forEach : 각 요소가 들어오면,for문과 같은 원리

        Stream<String> stream1 = sList.stream();
        stream1.sorted().forEach(s-> System.out.println(s)); //sort한 다음 하나씩 출력
        //sorted 중간연산
        //forEach 최종연산
    }
}
