package Collection.arraylist;
import Collection.Member;
import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> memList;

    public MemberArrayList() {
        memList = new ArrayList<Member>();
    }

    public void addMember(Member member) {
        memList.add(member);
    }
    // 정말 삭제됐는지 확인하기 위해 boolean 리턴
    public boolean removeMemeber(int memberid) {
        /*for (int i = 0; i < memList.size(); i++) {
            Member member = memList.get(i);
            int tempid = member.getMemberid();
            if (memberid == tempid) {
                memList.remove(i);
                return true;
            }
        }*/
        Iterator<Member> iterator = memList.iterator();
        while( iterator.hasNext()) { //다음 것이 있는지 확인
            Member member = iterator.next();
            int tempid = member.getMemberid();
            if( memberid == tempid ) {
                memList.remove(member); //remove는 인덱스로 찾거나 객체 자체를 제거하는 방법 두가지
                return true;
            }
        }
        System.out.println("No." + memberid + " does not exist");
        return false;
    }

    public void showALL() {
        /*for( Member mem : memList ) {
            System.out.println(mem);
        }
        System.out.println(memList);
*/
        Iterator<Member> iterator = memList.iterator();
        while( iterator.hasNext()) { //다음 것이 있는지 확인
            Member member = iterator.next();
            System.out.println(member);
            }
    }
}

