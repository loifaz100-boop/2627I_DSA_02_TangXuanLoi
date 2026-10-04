package Week3_Stack_Queue.BT_LapTrinh.Bai3;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class QueueUse2Stack<Item> {

    private Stack<Item> stackIn = new Stack<>();
    private Stack<Item> stackOut = new Stack<>();
    public void enqueue(Item item) {
        stackIn.push(item);
    }

    private void checkEmpty() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }
    }

    public Item dequeue() {
        if (stackIn.isEmpty() && stackOut.isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }

        checkEmpty();
        return stackOut.pop();
    }

    public Item printFirst() {
        if (stackIn.isEmpty() && stackOut.isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }

        checkEmpty();
        return stackOut.peek();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QueueUse2Stack<Integer> queue = new QueueUse2Stack<>();

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int type = sc.nextInt();

            if (type == 1) {
                int x = sc.nextInt();
                queue.enqueue(x);
            }
            else if (type == 2) {
                queue.dequeue();
            }
            else if (type == 3) {
                System.out.println(queue.printFirst());
            }
        }

        sc.close();
    }
}