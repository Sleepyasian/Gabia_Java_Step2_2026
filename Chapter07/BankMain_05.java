
import java.util.Scanner;

public class BankMain_05 {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    System.out.print("지점: ");
    String point = scan.next();
    System.out.print("전화번호");
    String tel = scan.next();
    Bank bank = new Bank(point,tel);

    System.out.println(point + "이자율: ");
    Bank.interest = scan.nextFloat();

    bank.getBank();

    System.out.println();
     System.out.print("지점: ");
    String point2 = scan.next();
    System.out.print("전화번호");
    String tel2 = scan.next();
    Bank bank2 = new Bank(point2,tel2);
    bank2.getBank();
    



    }
}
