
import javax.swing.JOptionPane;

class out {
    static int a = 1;

    public class In {

        public String Infun() {
            return a + "번째 Non-Static 내부";
        }
    }

    public static void In() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'In'");
    }

}

public class NonStatic_01 {

    public static void main(String[] args) {
        out obj1 = new out();
        obj1.new In();
        out.In obj2 =  obj1.new In();
        String str = obj2.Infun();
        JOptionPane.showMessageDialog(null, str + "\n Success");
        
    }

}
