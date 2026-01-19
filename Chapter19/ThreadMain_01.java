public class ThreadMain_01 {
    public static void main(String[] args) {
        Tread_01 t = new Tread_01();
        t.start();
        t.run();//독립적인 공간은 있지만 스레드 (multi run )역할은 할 수 없다
        System.out.println("Main 종료 ");



    }

}
