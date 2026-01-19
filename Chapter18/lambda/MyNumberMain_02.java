package lambda;
public class MyNumberMain_02 {

public static void main(String[] args) {
    
    MyNumber max = (x,y) -> (x>=y)? x:y;
System.out.println(max.getMax(10, 20));

MyNumber aa =new MyNumber() {

    @Override
    public int getMax(int x, int y){
        int max = (x>=y)?x:y;
        return max;
    }
};
System.out.println(aa.getMax(10,20));

}
}
