public class StringEquals_03 {
    public static void main(String[] args) {
        String strVar1 = new String("홍길동");//heap
        String strVar2 = "홍길동"; // JVM에서 특별관리하는 메모리 영역 -> constant pool
    

        //외부 메모리 주소 비교 
        if(strVar1 == strVar2){
            System.out.println("같은 String 객체를 참조");
        }else{
            System.out.println("다른 String 객채 참조 ");
        }
        //---------------------------------------------------

        if(strVar1.equals(strVar2)){
            System.out.println("같은 String 객체를 참조");
        }else{
            System.out.println("다른 String 객채 참조 ");
        }

        String str1 = new String("test");
        String str2 = new String("test"); // heap

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String str = "abc";//상수풀
        String str3 = "abc";
        System.out.println(str == str3);
    
        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        System.out.println(i1.equals(i2) );
        System.out.println(i1 == i2 );

        




    }



}
