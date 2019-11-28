import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        /* PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.offer(1);
        priorityQueue.offer(-1);
        priorityQueue.offer(10);
        priorityQueue.offer(5);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue); */
        PriorityQueue priorityQueue = new PriorityQueue((o1, o2) -> {
            return ((Integer)o1).intValue() - ((Integer)o2).intValue();
        });
        priorityQueue.offer(1);
        priorityQueue.offer(-1);
        priorityQueue.offer(10);
        priorityQueue.offer(5);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        // 在使用PriorityQueue队列的定制排序时只有在取出元素时才会有效
    }
}
