
import java.util.Scanner;

public class Guide {
    static String point;
    Guest guest[]; // String str[] = new String[5];
    Scanner scan;
    
    //생성자
    public Guide() {
    
    }
    public Guide(int n) {
    point = "발리";
    //관광객수 만큼 메모리 확보
    guest = new Guest[n];

    //초기화
for(int i = 0; i<n;i++){
    guest[i] = new Guest();
    }

}
//getter
public static String getPoint(){

    return point;
}

}    
