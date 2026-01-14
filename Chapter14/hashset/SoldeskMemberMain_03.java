package hashset;

public class SoldeskMemberMain_03 {
    public static void main(String[] args) {

        //SoldeskMemeber의 객체(맴버)가 저장될수 있는 Hashset이 생성됨
        SolDeskMemberManager manager = new SolDeskMemberManager();

        //회원가입할때 필요한 정보를 저장

        SolDeskMember member1 = new SolDeskMember(1001, "이자바");
        SolDeskMember member2 = new SolDeskMember(1002, "김자바");
        SolDeskMember member3 = new SolDeskMember(1003, "박자바");
        SolDeskMember member4 = new SolDeskMember(1004, "손자바");
         
        manager.addMember(member1);
        manager.addMember(member2);
        manager.addMember(member3);
        manager.addMember(member4);

        manager.showAllMember();
        
        manager.addMember(new SolDeskMember(1003, "박자바"));

        System.out.println("==========전체 회원 목록===========");
        manager.showAllMember();

    }
}
