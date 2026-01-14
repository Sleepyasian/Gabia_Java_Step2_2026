
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDifference_03 {
    public static void main(String[] args) {
        
        Map<String,String> hashMap = new HashMap<String,String>();

        hashMap.put("apple", "red");
        hashMap.put("banana", "yellow");
        hashMap.put("grape", "purple");
        hashMap.put("orange", "orange");

        //HashMap 출력(순서가 보장되지 않음)
        System.out.println("-------------------------------------");
        for (Map.Entry<String, String> entry:hashMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
         Map<String,String>linkedHashMap = new LinkedHashMap<String,String>();
        
        linkedHashMap.put("apple", "red");
        linkedHashMap.put("banana", "yellow");
        linkedHashMap.put("grape", "purple");
        linkedHashMap.put("orange", "orange");

        //HashMap 출력(순서가 보장됨)
        System.out.println("-------------------------------------");
        for (Map.Entry<String, String> entry:linkedHashMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }


    }

}
