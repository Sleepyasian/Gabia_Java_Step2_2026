public class PhoneMain_04 {
    public static void main(String[] args) {
        
        SmartPhone smartPhone = new SmartPhone(" 김자바");
        
        System.out.println(smartPhone.owner + "님");
        smartPhone.turnOn();
        smartPhone.intersearch();
        smartPhone.turnOff();
    }

}
