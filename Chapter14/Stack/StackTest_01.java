
import java.util.Stack;

public class StackTest_01 {
    public static void main(String[] args) {

        Object obj;

        Stack<Object> st = new Stack<>();

        if (st.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                st.push(new String("Hi" + i));
                System.out.println("입력 " + i + "번째" + st.peek());
            }
        } // if


        System.out.println();
        System.out.println("현재 출력 데이터: " + st.pop());
        System.out.println("현재 TOP의 위치(peek): " + st.peek());
        System.out.println();
        System.out.println("현재 TOP의 위치(peek): " + st.peek());
        System.out.println("현재 출력 데이터: " + st.pop());
        st.push(new String("everybody"));
        System.out.println("현재 TOP의 위치(peek): " + st.peek());
        st.push(new String("Happy"));
        System.out.println("현재 TOP의 위치(peek): " + st.peek());
        System.out.println();
        
    }

}
