package Collection.TreeSet;

import Collection.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member mem1 = new Member(102,"lee");
        Member mem2 = new Member(202,"kim");
        Member mem3 = new Member(302,"ban");
        Member mem4 = new Member(402,"shin");

        memberTreeSet.addMember(mem1);
        memberTreeSet.addMember(mem2);
        memberTreeSet.addMember(mem3);
        memberTreeSet.addMember(mem4);
        memberTreeSet.showAll();
    }
}
