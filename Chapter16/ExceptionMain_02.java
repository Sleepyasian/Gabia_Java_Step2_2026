public class ExceptionMain_02 {
    public static void main(String[] args) {

        int var = 50;
        int data = 0;

        try {
            System.out.println(var / data);
        } catch (NumberFormatException | ArithmeticException nae) {

            System.out.println("예외 발생");
        } catch (Exception e) {
            System.out.println("예외 발생");
        }
        System.out.println("program end");
    }

}
