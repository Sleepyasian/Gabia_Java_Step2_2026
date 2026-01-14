
import javax.swing.JOptionPane;

class Out2 {
    static int a = 1;
    int b;

    public static class In {
        String Infun() {
            return a + "번째 static 내부 클래스";
        }
    }
}

public class StaticClassMain_02 {
    public static void main(String[] args) {
        //static 클래스는 직접 접근이 가능
        Out2.In obj1 = new Out2.In();
        //내부 클래스 메서드
        String str=obj1.Infun();
        JOptionPane.showMessageDialog(null, str);

    }

}
