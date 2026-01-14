
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UserInfoMain_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<UserInfo> arr = new ArrayList<UserInfo>();
        
        
        while (true) {
            System.out.println("아이디 생성(exit 입력시 종료): ");
            String id = scan.next();
            if (id.equals("exit")) {
                System.exit(0);
            } else {
                UserInfo info = new UserInfo();
                
                info.setId(id);
                System.out.println("패스워드 입력");
                info.setPwd(scan.nextInt());

                arr.add(info);
               


            }
            // Iterator<UserInfo> it = arr.iterator();
            //      while(it.hasNext()){
            //         info=it.next();
            //     System.out.print(info.getId()+" ");
            //    System.out.print(arr.getPwd());
            
            for (int i = 0; i < arr.size(); i++) {
                System.out.println("아이디+ 비번");
                System.out.print(arr.get(i).getId()+" ");
                System.out.print(arr.get(i).getPwd());
                System.out.println();

            }

            
        }

    }

}
