
import java.util.Scanner;

public class SchedulerMain_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        
        while (true) {
            System.out.println();
            System.out.println("R or r : 한명씩 차례로 할당");
            System.out.println("L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
            System.out.println("P or p : 업무 skill 값이 높은 상담원에게 할당");
            System.out.println("S or s : 종료");
            System.out.print("전화 상담 방식을 선택하세요 : ");
            char input = scan.next().toUpperCase().charAt(0);
            int ch = (int) input;
            switch (ch) {
                case 'R':
                case 'r':
                    RoundRobin rr = new RoundRobin();
                    rr.getNextCall();
                    rr.sendCallToAgent();
                    break;
                case 'L':
                case 'l':
                    LeastJob lj = new LeastJob();
                    lj.getNextCall();
                    lj.sendCallToAgent();
                    break;
                case 'P':
                case 'p':
                    PriorityAllocation pa = new PriorityAllocation();
                    pa.getNextCall();
                    pa.sendCallToAgent();                 
                    break;
                case 'S':
                case 's':
                    System.out.println("프로그램을 종료합니다.");
                    System.exit(0);
                default:
                    System.out.println("없는 값입니다");
                    break;
            
        }


}
    }
    public static void exe(Scheduler scheduler) {
        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}

    