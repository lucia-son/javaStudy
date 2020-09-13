package Collection.hashmap;
import Collection.Member;
import java.util.HashMap;
import java.util.Iterator;


public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<Integer, Member>();
    }
    public void addMember(Member member) {
        hashMap.put(member.getMemberid(), member);
    }
    public boolean delMember(int memberid) {
        if(hashMap.containsKey(memberid)) {
            hashMap.remove(memberid);
            return true;
        }
        System.out.println("member does not exist");
        return false;
    }
    public void showAll() {
        Iterator<Integer> ir = hashMap.keySet().iterator(); //key를 기반으로 가져옴
        while(ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key); //key를 가지고 member를 꺼내오기
            System.out.println(member);
        }
    }
}
