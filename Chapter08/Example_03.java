import java.util.Scanner;



public class Example_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("기본 공격력을 입력하세요: ");
        int power = scan.nextInt();

        System.out.println("전사의 스킬:"+useSkill(new Warrior(), power));
        System.out.println("마법사의 스킬:"+useSkill(new Mage(), power));

    }
    public static int useSkill(char1 c, int dmg) {

        return c.attack(dmg);
    }
  }
