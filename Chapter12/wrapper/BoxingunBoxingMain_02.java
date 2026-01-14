public class BoxingunBoxingMain_02 {
    public static void main(String[] args) {

        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer(200);
        Integer obj3 = Integer.valueOf(300);
        Integer total1=obj1 + obj2;
        Integer total2=obj2+obj3;

        System.out.println("Integer total: "+ total1);
        System.out.println(total2);

        Integer obj = 100;
        System.out.println("value" + obj.intValue());

        int val1 = obj1.intValue();
        


    }

}
