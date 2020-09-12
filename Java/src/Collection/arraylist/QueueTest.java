package Collection.arraylist;

import java.util.ArrayList;

class Queue {
    private ArrayList<String> arrayQueue = new ArrayList<>();

    public void enQueue(String data) {
        arrayQueue.add(data);
    }
    public String deQueue() {
        int len = arrayQueue.size();
    if(len == 0) {
        System.out.println("Queue is empty");
        return null;
    }
    return arrayQueue.remove(0); //get()은 값만 조회, remove()는 값 조회+삭제까지
    }
}
public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enQueue("a");
        queue.enQueue("b");
        queue.enQueue("c");
        queue.enQueue("d");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
    }
