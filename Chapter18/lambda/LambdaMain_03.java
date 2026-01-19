
package lambda;
interface MyFunctionInterface{
    void showMsg(String message);

}
public class LambdaMain_03 {
        public static void main(String[] args) {
        MyFunctionInterface f = s -> System.out.print(s);
        f.showMsg("람다식 생성 ");
        //========================================================
        showMyMsg(f);
    
    }
    public static void  showMyMsg(MyFunctionInterface f){
        f.showMsg("람다식 생성2");

    }

}
