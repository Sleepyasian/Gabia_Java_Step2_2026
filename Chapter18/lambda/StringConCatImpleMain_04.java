package lambda;
public class StringConCatImpleMain_04 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        System.out.println("--- 인스턴스 변수 => 객체 --");
        StringConcat concat1 = new StringConCatImple();
        concat1.makeString(s1, s2);

        System.out.println("--- 람다식 사용 --");
        StringConcat scci = (a, b) -> System.out.println(a + b);
        scci.makeString(s1, s2);

        System.out.println();
        //익명의 내부 클래스 방식

        //Imple 구현부
        StringConcat concat3 = new StringConcat() {
             @Override
    public void makeString(String s1, String s2) {
        System.out.println(s1 + s2);
    }
        };
        concat3.makeString(s1, s2);
    }
}
