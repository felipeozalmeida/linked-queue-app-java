import models.Queue;

public class LinkedQueueApp {
    public static void main(String[] args) {
        Queue myQueue = new Queue();

        for (int i = 0; i < 5; i++) {
            myQueue.push(i);
        }

        System.out.println(myQueue);

        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.pop() + " removed.");
            System.out.println(myQueue);
            System.out.println(myQueue.getFirst());
        }
    }
}
