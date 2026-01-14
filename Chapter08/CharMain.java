
import java.util.Scanner;

public class CharMain {
    // public static int attackpoint(Character character, int power){
    //     return character.attack(power);
    //  }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("기본 공격력을 입력하세요: ");
        int battack = scan.nextInt();

        char1 characters[] = { new Warrior(), new Mage() };


        // int hit1 = attackpoint(new Warrior(), battack);
        // int hit2 = attackpoint(new Mage(), battack);
        // System.out.println("Warrior의 공격력: " + hit1);
        // System.out.println("Mage의 공격력: " + hit2);
        
        // for(int i = 0; i < characters.length; i++){
        //     System.out.println(characters[i].getClass().getSimpleName() + "의 공격력은" + characters[i].attack(battack));
        // }

        for (char1 chars : characters) {
            System.out.println(chars.getClass().getSimpleName() + "의 공격력은" + chars.attack(battack));
            // System.out.println(chars.getClass().getSimpleName() + "의 공격력은" + attackpoint(chars, battack));
            
        }

    }

}
