
import java.util.ArrayList;
import java.util.List;

public class List_01 {

    public static void main(String[] args) {

        // ArrayList<String> student = new ArrayList<String>();
        List<String> students = new ArrayList<String>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");

        System.out.println("-----------------------");

        for (String student : students) {
            System.out.println(student);

        }
        System.out.println("---------------------");
        students.remove("Bob");
        for (String student : students) {
            System.out.println(student);

        }

    }

}
