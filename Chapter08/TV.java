public class TV extends Appliance {

    public TV(String brand) {
        super(brand);
    }

    @Override
    void turnOn() {
        //System.out.println(brand + " 전원을 켭니다."); 
        super.turnOn();// 부모 클래스의 turnOn() 메서드 호출
        System.out.println("TV 화면을 켭니다.");
    }

}
