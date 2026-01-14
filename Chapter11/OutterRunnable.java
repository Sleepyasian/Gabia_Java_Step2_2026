public class OutterRunnable {

    Runnable runner = new Runnable() {
        public void run(){

        }
    };

    public class AnonymousInnerMain_05{
        public static void main(String[] args) {
            OutterRunnable out = new OutterRunnable();
            out.runner.run();

        }
    }


}
