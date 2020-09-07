package ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //enhanced for loop
        for(String num : list)
            System.out.println(num);

        /* for(int i = 0 ; i<list.size(); i++)
            System.out.println(list.get(i)); //index []표시가 아님을 유의의
        */
   }
}
