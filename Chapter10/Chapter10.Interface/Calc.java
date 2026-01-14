public interface Calc {

    public static final double PI = 3.14;
    int error = -9999999;

    int add(int num1, int num2);

    int subtract(int num1, int num2);

    int times(int num1, int num2);

    int divide(int num1, int num2);

    default void description() {
        System.out.println("정수 계산기");
    }

    static int total(int arr[]){
        int total = 0;
        for(int i: arr){
            total +=i;

        }
        return total;
    }
    private void myMethod() {
		System.out.println("private 메서드");
	}
    private static void myStaticMethod() {
        System.out.println("private static 메서드");  
    }

}