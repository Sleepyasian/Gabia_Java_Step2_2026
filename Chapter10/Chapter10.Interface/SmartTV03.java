public class SmartTV03 {
    public static void main(String[] args) {
        SmartTelevision smartTV = new SmartTelevision();
        smartTV.turnOn();
        smartTV.search("www.youtube.com");
        smartTV.setVolume(13);
        smartTV.setVolume(6);
        smartTV.turnOff();
        System.out.println();

        Remote rc = smartTV;
        rc.turnOn();
        rc.setVolume(8);
        rc.turnOff();
        System.out.println();

        Searchable sc = smartTV;
        sc.search("www.naver.com");
        System.out.println();


    }

}
