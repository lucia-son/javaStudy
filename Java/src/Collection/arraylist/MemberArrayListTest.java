package Collection.arraylist;

import Collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memList = new MemberArrayList();
        Member mem1 = new Member(102,"KENNY");
        Member mem2 = new Member(203,"GEORGE");
        Member mem3 = new Member(304,"JOSHUA");
        Member mem4 = new Member(405,"LIZZY");

        memList.addMember(mem1);
        memList.addMember(mem2);
        memList.addMember(mem3);
        memList.addMember(mem4);

        memList.removeMemeber(mem2.getMemberid());

        memList.showALL(); //arrayList에는 이미toString이재정의되어있음 확인 가능

    }
}
