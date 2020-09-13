package Collection.treemap;

import Collection.Member;
import java.util.TreeMap;
import java.util.Iterator;


public class MemberTreeMap {

    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();
    }
    public void addMember(Member member) {
        treeMap.put(member.getMemberid(), member);
    }
    public boolean delMember(int memberid) {
        if(treeMap.containsKey(memberid)) {
            treeMap.remove(memberid);
            return true;
        }
        System.out.println("member does not exist");
        return false;
    }
    public void showAll() {
        Iterator<Integer> ir = treeMap.keySet().iterator(); //key를 기반으로 가져옴
        while(ir.hasNext()) {
            int key = ir.next();
            Member member = treeMap.get(key); //key를 가지고 member를 꺼내오기
            System.out.println(member);
        }
    }
}
