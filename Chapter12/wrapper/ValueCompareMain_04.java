public class ValueCompareMain_04 {
    public static void main(String[] args) {
        // 오토박싱의 범위
        System.out.println("[-128 ~ 128초과할 경우]");
        Integer obj1 = 300; // 4byte = 32 bit
        Integer obj2 = 300; // 4byte = 32 bit

        // 주소비교
        System.out.println("==결과: " + (obj1 == obj2));
        System.out.println("==언박싱결과: " + (obj1.intValue() == obj2.intValue()));

        System.out.println("[-128 ~ 128초과할 경우]");
        Integer obj3 = 100; // 4byte = 32 bit
        Integer obj4 = 100; // 4byte = 32 bit

        //주소비교(1byte 내에서는 캐싱(cache)되어 같은 객채에 사용
        System.out.println("==결과: " + (obj3 == obj4));
        System.out.println("==언박싱결과: " + (obj3.intValue() == obj4.intValue()));
        System.out.println("==equals:"+(obj3.equals(obj4)));



    }

}
