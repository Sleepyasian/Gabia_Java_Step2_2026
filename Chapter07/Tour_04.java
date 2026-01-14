import java.util.Scanner;

public class Tour_04 {
    public static void main(String[] args) {


        
        int count =0;
        boolean run = true;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("관광객 수: ");
        int n = scan.nextInt();
        scan.nextLine();
        
       //초기화 통해서 참조 메모리 확보(Guide의 객채) 
        Guide guide = new Guide(n);
        
        System.out.println("관광객등록: ");
        
       
        //이름 성별
        for(int i =0;i<n;i++){
        System.out.print("이름: ");
        String name = scan.nextLine();
        guide.guest[i].setName(name);
  
        System.out.print("성별: ");
        String gender = scan.nextLine();
        guide.guest[i].setGender(gender);
       
    }

    System.out.println();

    // Example usage of B (copied into Chapter07)
    B b = new B();
    b.method();

    while(true){
            OUTER:
            while (run) {
                System.out.println("1. 관광객 정보");
                System.out.println("2. 목적지 변경");
                System.out.println("3. 종료");
                System.out.print("선택>> ");
                int select = scan.nextInt();
                switch (select) {
                    case 1:
                        for(int i =0;i<n;i++){
                            System.out.println(guide.guest[i].getName());
                            System.out.println(guide.guest[i].getGender());
                            System.out.println(Guide.getPoint());
                        } 
                        break ;
                    case 2:
                        System.out.println("목적지 입력");
                        Guide.point = scan.next();
                        System.out.println("변경 목적지:"+Guide.point);
                        break ;
                    default:
                        run = false;
                        break OUTER;
                }
            }
    }
}
}
