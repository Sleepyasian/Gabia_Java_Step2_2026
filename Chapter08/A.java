public class A {

    //protected -> 같은 패키지에서는 public과 같음
    //다른 패키지에서는 private과 같음
    protected String field;

    protected void method() {
        System.out.println("A Class");
        System.out.println(field);
    }

}
