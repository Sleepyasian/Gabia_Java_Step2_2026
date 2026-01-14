public class Washer extends Appliance {

    public Washer(String brand) {
        super(brand);
    }
    

    void startWash() {
        System.out.println(brand + " 세탁을 시작합니다.");
    }

}
