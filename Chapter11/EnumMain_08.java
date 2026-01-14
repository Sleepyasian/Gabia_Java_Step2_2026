
import java.util.Scanner;

public class EnumMain_08 {
    public enum Item{
        start,pause,exit
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력하세요[0:게임시작, 1:일시정지, 2:게임종료] :  ");

            int n = scan.nextInt();

            Item start = Item.start;
            Item Pause = Item.pause;
            Item Exit = Item.exit;

            if(n==start.ordinal()){
                System.out.println("게임을 시작함");
            }else if(n==Pause.ordinal()){
                System.out.println("게임이 일시정지됨");
            }else if(n==Exit.ordinal()){
                System.err.println("게임종료");
                return;

            }else{
                
            }
        }
    }

}
