public class DaemonThread_09 implements Runnable {
    static boolean autosave = false;

    public static void main(String[] args) {
        DaemonThread_09 dm = new DaemonThread_09();
        Thread t = new Thread(dm);
        t.setDaemon(true);
        t.start();

        for(int i =0;i<15;i++){
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println(i);
            if(i==3){
                autosave=true;
            }
        }

        
    }
@Override
public void run(){
    while (true) { 
        try {
            Thread.sleep(3000);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(autosave){
            System.out.println("자동 저장 됩니다");
        }
    }}
}




