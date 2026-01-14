public class Fruit {

    private String sort; //분류
    private String season; // 개절


    //초기화 메서드
    public void Set1(String a, String b ){
        sort = a;
        season =b;
    }
    public void Disp1(){
        System.out.println("분류"+sort);
        System.out.println("개절:"+season);
    }
    

}
