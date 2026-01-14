import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashmap;

    public MemberHashMap() {
        hashmap = new HashMap<>();
    }

    // add member
    public void addMember(Member member) {
        hashmap.put(member.memberId(), member);
    }

    // show all members
    public void showAllMember() {
        // for (Member member : hashmap.values()) {
        //     System.out.println(member);
            Iterator<Integer> ir =hashmap.keySet().iterator();
            while(ir.hasNext()){
                int key=ir.next();
                Member member = hashmap.get(key);
                System.out.println(member);
            }
        }
    

    // remove member
    public boolean removeMember(int memberId) {
        if (hashmap.containsKey(memberId)) {
            hashmap.remove(memberId);
            return true;
        } else {
            System.out.println(memberId+"가존재하지 않습니다");
            return false;
        }
    }
}
