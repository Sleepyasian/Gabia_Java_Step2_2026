package queue;

import java.util.ArrayList;

class MyQueue {
    private ArrayList<String> queue = new ArrayList<String>();

    public void enQueue(String data) {
        queue.add(data);
    }

    public String deQueue() {
        int len = queue.size();
        if (len == 0) {
            System.out.println("스택이 비어 있습니다");
            return null;
        }

        return (queue.remove(0));
    }

    @Override
    public String toString() {

        return queue.toString();
    }

}
