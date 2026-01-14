public class ApplianceMain {
    public static void main(String[] args) {
        TV tv = new TV("Samsung");
        tv.turnOn();

        Washer washer = new Washer("LG");
        washer.turnOn();
        washer.startWash();

        Appliance list[] = new Appliance[3];
        list[0] = new Washer("LG");
        list[1] = new TV("Samsung");
        list[2] = new Washer("Daewoo");

        for(Appliance a:list){
            a.turnOff();
        }
    }
}
