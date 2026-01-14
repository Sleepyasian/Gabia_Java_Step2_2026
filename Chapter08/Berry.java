
public class Berry extends Fruit{

    //상속 키워드: extends

        private String name;
        private String size;

            //초기화 메서드

    public void set2(String a, String b){
        name = a;
        size = b;
    }
    public void Disp2(){
        System.out.println("과일 이름"+name);
        System.out.println("크기:"+size);
    }

}
