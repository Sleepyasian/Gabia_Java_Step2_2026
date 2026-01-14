
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {

    public void personMgr() {

        int select;

        // Person 객채들만 저장할 ArrayList

        ArrayList<Person> personarr = new ArrayList<Person>();

        while (true) {
            System.out.print("(1)회원가입, (2)정보삭제,(3)정보검색,(4)종료:");

            Scanner scan = new Scanner(System.in);
            select = scan.nextInt();

            Person p = new Person();
            switch (select) {
                case 1:
                    System.out.println("이름:");
                    p.setName(scan.next());

                    System.out.println("나이");
                    p.setAge(scan.nextInt());

                    System.out.println("전화번호");
                    p.setTel(scan.next());

                    personarr.add(p);
                    System.out.println("회원가입 완료");
                    break;
                case 2:
                    System.out.println("정보삭제");
                    String name = scan.next();
                    // for (Person p4 : personarr) {
                    //     if (name.equals(p4.getName())) {
                    //         personarr.remove(p4);
                    //         System.out.println(name+"님의 정보가 삭제되었습니다");
                    //     }
                    for(int i =0;i<personarr.size();i++){
                        if(personarr.get(i).getName().equals(name)){
                            personarr.remove(i);
                            System.out.println("삭제 완료");
                            break;
                        }else{
                            if(i+1 == personarr.size()){
                                System.out.println("없는 존재");
                            }
                        }
                    }
                    break;
                case 3:
                    //전채
                // System.out.println("---정보를 출력합니다--");
				// System.out.println("등록인원은 " + personarr.size() + "명");
                // Iterator<Person> it = personarr.iterator();
                // while(it.hasNext()){
                // p=it.next();
                // System.out.println(p.getName());
                // System.out.println(p.getAge());
                // System.out.println(p.getTel());

                //검색
                    System.out.println("이름검색");
                    String name1 = scan.next();
                    for(int i =0;i<personarr.size();i++){
                        if(name1.equals(personarr.get(i).getName())){
                            System.out.println(personarr.get(i).getName());
                            System.out.println(personarr.get(i).getAge());
                            System.out.println(personarr.get(i).getTel());
                        }
                    }

                    // for (Person plist : personarr) {
                    //     if(name1.equals(plist.getName())){  
                    //     System.out.println(plist.getName());
                    //     System.out.println(plist.getAge());
                    //     System.out.println(plist.getTel());
                    //     }
                    
                  break;
                default:
                    System.out.println("프로그램 종료");
                    return;
            }

        }
    }

}
