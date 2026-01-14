
import java.util.ArrayList;

class myStack{
    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data){
        arrayStack.add(data);
    }
    public String pop(){
        int len = arrayStack.size();

        if(len == 0 ){
            System.out.println("스택이 비어 있습니다");
            return null;

        }
        return (arrayStack.remove(len-1));
    } 

    @Override
    public String toString() {
        return arrayStack.toString();
    }

}
public class StackTest_02{
    public static void main(String[] args) {

        myStack stack = new myStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.toString());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.toString());
        
    }
}
