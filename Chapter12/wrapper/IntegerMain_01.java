public class IntegerMain_01 {
    public static void main(String[] args) {
        // int -> Basic// Integer-> reference type
        Integer i = new Integer(100);

        Integer num = 100; // reference variable(autoboxing)
        int iNum = num.intValue(); // unboxing: class(reference) -> basic type
        
        int jNum = 200;

        //unboxing(Integer -> int)
        int sum = iNum+jNum;
        System.out.println(sum);
        int total = num.intValue() + jNum;
        System.out.println(total);

        //autoboxing(int -> Integer)
        Integer x = jNum;
        Integer y = Integer.valueOf(jNum);
        System.out.println(x);
        System.out.println(y);


    }

}
