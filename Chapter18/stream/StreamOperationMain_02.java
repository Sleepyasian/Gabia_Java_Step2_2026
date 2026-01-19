package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperationMain_02 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Sophia", "Emma", "Olivia", "Isabella", "Mia");

        Stream<String> stream = list.stream();
        // 중간연산 sorted () 수행후 최종연산 foreach
        stream.sorted().forEach(System.out::println);

        // 에러 : 한번 사용한 스트림은 재사용이 안됨()
        // stream.filter(s -> s.contains("m")).forEach(System.out::println);

        System.out.println();
        System.out.println("m or M 이 들어간 이름 출력");
        list.stream().filter(s -> s.toUpperCase().contains("M")).forEach(System.out::println);

        System.out.println("이름 길이가 5자 이상 출력");
        list.stream().filter(s -> s.length() >= 5).forEach(System.out::println);

        // --------------------------------------------------------------
        int arr[] = { 39, 58, 88, 56, 77, 99, 23 };

        System.out.println("오름차순 정렬 후 출력");

        Arrays.stream(arr).sorted().forEach(System.out::println);

        // 짝수 출력
        System.out.println("짝수 출력");
        Arrays.stream(arr).filter(s -> s % 2 == 0).forEach(System.out::println);

        System.out.println();
        System.out.println("배수");
        Arrays.stream(arr).filter(s -> s % 2 != 0 && s % 3 != 0).forEach(System.out::println);

    }

}
