package Collection.TreeSet;

import Collection.Member;
import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>();
    }
    public void addMember(Member member) {
        treeSet.add(member);
    }
    public boolean removeMember(int memberid) {
        Iterator<Member> iterator = treeSet.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();

            int tempid = member.getMemberid();
            if (memberid == tempid) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println( "member id does not exist");
        return false;
    }
    public void showAll() {
        for(Member mem : treeSet) {
            System.out.println(mem);
        }
        System.out.println(treeSet);
    }
}
