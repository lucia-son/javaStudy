package Collection.hashset;

import Collection.Member;

import java.util.HashSet;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member mem1 = new Member(102,"lee");
        Member mem2 = new Member(202,"kim");
        Member mem3 = new Member(302,"ban");
        Member mem4 = new Member(402,"shin");

        memberHashSet.addMember(mem1);
        memberHashSet.addMember(mem2);
        memberHashSet.addMember(mem3);
        memberHashSet.addMember(mem4);
        memberHashSet.showAll();
        System.out.println("--------------------");
        Member mem5 = new Member(102,"chan");
        memberHashSet.addMember(mem5);
        memberHashSet.showAll();
        //equals()와 hashcode()를 구현해야 중복을 체크할 수 있음
        //해당 메서드를 파라미터값에 들어가는 참조 클래스에 구현해야 함
    }
}
