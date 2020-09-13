package Collection.hashmap;

import Collection.Member;
import Collection.hashset.MemberHashSet;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member mem1 = new Member(102, "lee");
        Member mem2 = new Member(202, "kim");
        Member mem3 = new Member(302, "ban");
        Member mem4 = new Member(402, "shin");

        memberHashMap.addMember(mem1);
        memberHashMap.addMember(mem2);
        memberHashMap.addMember(mem3);
        memberHashMap.addMember(mem4);
        memberHashMap.showAll();
        System.out.println("--------------------");
        memberHashMap.delMember(102);
        memberHashMap.showAll();
    }
}
