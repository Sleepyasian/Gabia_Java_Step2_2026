
public class KeyMain {

    public static void main(String[] args) {
        Key hashKey1 = new Key(1);
        Key hashKey2 = new Key(1);
        Key hashKey3 = new Key("이름");
        Key hashKey4 = new Key("이름");
        
        System.out.println(hashKey1);
        System.out.println(hashKey2);
        System.out.println(hashKey3);
        System.out.println(hashKey4);


        if (hashKey1.equals(hashKey2)) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }

        if (hashKey3.name.equals(hashKey4.name)) {

            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }

}
