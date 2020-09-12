package Collection.hashset;
import Collection.Member;
import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<Member>();
    }
    public void addMember(Member member) {
        hashSet.add(member);
    }
    public boolean removeMember(int memberid) {
        Iterator<Member> iterator = hashSet.iterator();
        while(iterator.hasNext()) {
            Member member = iterator.next();

            int tempid = member.getMemberid();
            if (memberid == tempid) {
                hashSet.remove(member);
                return true;
            }
        }
        System.out.println( "member id does not exist");
        return false;
    }
    public void showAll() {
        for(Member mem : hashSet) {
            System.out.println(mem);
        }
        System.out.println(hashSet);
    }
}
