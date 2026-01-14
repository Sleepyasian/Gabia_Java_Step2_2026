class OutterRun{
    Runnable getRunnable(int i ){
        int num = 100;

        return new Runnable(){

            @Override
            public void run(){

                System.out.println(i);
                System.out.println(num);

            }
        };
    }
}
public class AnonymousInnerMain_05 {
    public static void main(String[] args) {
        OutterRun out = new OutterRun();
        Runnable runnable=out.getRunnable(10);
        
    }


}
