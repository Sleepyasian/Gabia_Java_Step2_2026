
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateMain_04 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        String strNow = now.toString();//heap ->String type 으로 변환
        System.out.println("---------Date-------------");
        System.out.println(strNow);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String strNow2 = sdf.format(now);
         System.out.println("---------Date-------------");
        System.out.println(strNow2);



    }

}
