package Collection.hashset;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        boolean b1 = set.add("spring"); //add메서드의 반환값은 boolean형태
        System.out.println(b1); //true

        boolean b2 = set.add("spring");
        System.out.println(b2); //false : 중복값이기 때문에 들어가지 않음

        set.add("summer");
        set.add("fall");
        System.out.println(set); //넣는 순서와 상관 없이 출력
    }
}
