public class DmbCellPhoneMain_09 {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("Java폰", "black", 11);
        System.out.println("모델 : " + dmbCellPhone.model);
        System.out.println("색상 : " + dmbCellPhone.color);
        System.out.println("채널 : " + dmbCellPhone.channel);
        System.out.println("--------------------------");

        dmbCellPhone.powerOn();
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("Hello");
        dmbCellPhone.receiveVoice("Hi");
        dmbCellPhone.hangUp();
        dmbCellPhone.turnOffDmb();
        dmbCellPhone.powerOff();
        


    }
}
