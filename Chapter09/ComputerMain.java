public class ComputerMain {
    public static void main(String[] args) {

    //    //추상클래스는 객채를 만들수 없다
    //     Computer comp = new Computer();
    //     comp.turnon();
    //     comp.display();
    //     comp.typing();
    //     comp.turnoff();

    Computer cs = new Desktop();
    cs.turnon();
    cs.display();

    Computer mn = new MyNoteBook();
    mn.display();
    mn.typing();
    }

}
