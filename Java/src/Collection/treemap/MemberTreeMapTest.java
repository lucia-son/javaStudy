package Collection.treemap;

import Collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member mem4 = new Member(402, "shin");
        Member mem1 = new Member(102, "lee");
        Member mem2 = new Member(202, "kim");
        Member mem3 = new Member(302, "ban");


        memberTreeMap.addMember(mem1);
        memberTreeMap.addMember(mem2);
        memberTreeMap.addMember(mem3);
        memberTreeMap.addMember(mem4);
        memberTreeMap.showAll();
        System.out.println("--------------------");
        memberTreeMap.delMember(102);
        memberTreeMap.showAll();
    }
}
