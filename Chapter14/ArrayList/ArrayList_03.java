
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_03 {
    public static void main(String[] args) {
     
        ArrayList<String> list = new ArrayList<String>();
        list.add("지건우");
		list.add("김태완");
		list.add("이연승");
		list.add("김자월");
		list.add("김청우");
		list.add("김민석");

        System.out.println(list);
        System.out.println("-----------------");

        //반복자

        Iterator<String> names = list.iterator();
        while(names.hasNext()){
            String n = names.next();
            System.out.print(n+ " ");
        }

    }

}
