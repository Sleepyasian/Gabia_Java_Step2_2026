package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class LambdaMain_05 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> f1 = (x, y)
        
        -> x + y;
        System.err.println("15와 24의 합은: " + f1.apply(15, 24));

        BiFunction<String, String, String> f2 = (s1, s2) -> s1.concat(s2);
        System.err.println(f2.apply("Hello ", "World"));

        BiConsumer<Integer, Integer> f3 = (x, y) -> System.out.println(x > y ? x : y);
        System.out.println("10과 9중 큰수 출력: ");
        f3.accept(10, 9);

        // 매개변수(인자)로 받은 문자열과 숫자가 동일한 크기 인지 판별
		BiPredicate<String, Integer> f4 = (x, y) -> x.length() == y;
        System.out.println("Apple은 5자이다: "+f4.test("apple", 5));

    }

}
