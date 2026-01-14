
import java.util.Scanner;

public class CalMain {
    public static void main(String[] args) {

        Example calPlus = new CalPlus();
        Example calMinus = new CalMinus();

        Example[] calculators = { new CalPlus(), new CalMinus() };
        Scanner scan = new Scanner(System.in);
        System.out.println("n1과 n2의 값을 입력하세요.");
        int a = scan.nextInt();
        int b = scan.nextInt();

        for(Example calc: calculators){
            System.out.println(calc.getClass().getSimpleName() + " : " + calc.getResult(a, b));
        }
    
        /* 
        System.out.println("Calplus : " + calPlus.getResult(a, b));
        System.out.println("CalMinus : " + calMinus.getResult(a, b));



        System.out.println("CalPlus : " + calPlus.getResult(20, 10));
        System.out.println("CalMinus : " + calMinus.getResult(20, 10));

 */
        int plus = calcu(new CalPlus(), a, b);
        int minus = calcu(new CalMinus(), a, b);
        System.out.println("CalPlus : " + plus);
        System.out.println("CalMinus : " + minus);
       
    }
    public static int calcu(Example example, int n1, int n2){
        return example.getResult(n1, n2);

    }

}
   
