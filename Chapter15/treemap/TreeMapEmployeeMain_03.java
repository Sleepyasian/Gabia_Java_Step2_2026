
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEmployeeMain_03 {

    public static void main(String[] args) {
        TreeMap<Integer,Employee> employeeMap = new TreeMap<>();

        Employee member1 = new Employee("이름1", 30);
         employeeMap.put(1001,member1);
		employeeMap.put(1002,  new Employee("이름2", 20));
		employeeMap.put(1003,  new Employee("이름3", 24));
		employeeMap.put(1004,  new Employee("이름4", 30));
        System.out.println("==학생 성적 출력(이름순 정렬)==");
        for(Map.Entry<Integer, Employee> entry:employeeMap.entrySet()){
            System.out.println(entry.getKey()+": " + entry.getValue());
        }
        int employeeID = 1003;
        System.out.println("\n"+employeeID+" : "+employeeMap.get(employeeID));

    } 
}
