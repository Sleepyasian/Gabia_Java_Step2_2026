
public class StaticInner_03 {
    //맴버 변수
    int a = 10;                 //Stack 영역
    private int b = 10;        // class 내부에서만 사용가능
    static int c = 200;        // Metaspace

    //내부 클래스 //Metaspace
    static class Inner{
        static int d = 1000;

        public void printdata(){

            // System.out.println("Metaspace 영역이 아니므로 사용불가능: "+ a);
            // System.out.println("Metaspace 영역이 아니므로 사용불가능: "+ b);
            System.out.println(c);
            System.out.println(d);
        }


    }
    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.printdata();
        

    }

}
