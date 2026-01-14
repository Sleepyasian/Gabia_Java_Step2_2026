public class StrawBerry extends Berry {

    private String color;
    private int price;

    public void set3(String a, int b) {
        color = a;
        price = b;
    }

    public void Disp3() {
        System.out.println("색갈:" + color);
        System.out.println("색갈" + price);
    }
}
