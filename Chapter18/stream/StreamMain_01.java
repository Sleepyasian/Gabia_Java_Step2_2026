package stream;

import java.util.Arrays;
import java.util.List;

public class StreamMain_01 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ace", "Anna", "kev", "brian", "가은호");

        // 길이가 3 이상인 이름을 대문자로 바꾸고 정력하여 출력
        names.stream().filter(name -> name.length() >= 3).map(String::toUpperCase).sorted()
                .forEach(System.out::println);
    }

}
