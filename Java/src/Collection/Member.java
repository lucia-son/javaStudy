package Collection;

import java.util.Comparator;

public class Member implements Comparable<Member>, Comparator<Member> {

    private int memberid;
    private String memberName;

    public Member(int memberid, String memberName) {
        this.memberid = memberid;
        this.memberName = memberName;
    }

    public int getMemberid() {
        return memberid;
    }

    public void setMemberid(int memberid) {
        this.memberid = memberid;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String toString() {
        return "No." + memberid + ": " + memberName;
    }

    @Override
    public int hashCode() {
        return memberid; //memberid가 같으면 같은 사람이라는 전제가 있기 때문에 id를 hashcode로 사용
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {  //처음에 오브젝트로 들어온 객체가 멤버형인지 체크
            Member member = (Member)obj;  //오브젝트로 들어온 값을 다운캐스팅하여 비교

            return this.memberid == member.getMemberid();
        } return false;
    }
    @Override
    public int compareTo(Member member) { //<- 이 member는 기존트리노드에 있는 객체
        //return (this.memberid - member.memberid); //return값이 양수로 반환되면 오름차순
        // return (this.memberid - member.memberid)*(-1); //return값이 음수로 반환되면 내림차순
        return (this.memberName.compareTo(member.memberName)); //이름 순으로 배열
    }
    //comparator, comparable 인터페이스 중 하나만 구현하면 됨

    @Override
    public int compare(Member member1, Member member2) { //member1:기존의 객체 member2:넘어온 객체
        return (member1.memberid - member2.memberid);
    }
}
