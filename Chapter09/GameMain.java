public class GameMain {
    public static void main(String[] args) {

        GameCharacter warrior = new Warrior();

        warrior.fight();

        System.out.println();

        GameCharacter wizard = new Wizard();
        wizard.fight();
        
    }
 

}
