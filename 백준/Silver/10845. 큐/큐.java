
import java.io.*;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        MyQueue<Integer> q = new MyQueue<>();

        while (N-- > 0) {
            String[] cmd = br.readLine().split(" ");

            switch (cmd[0]) {
                case "push":
                    q.enqueue(Integer.parseInt(cmd[1].trim()));
                    break;
                case "pop":
                    bw.write(q.isEmpty() ? "-1\n" : q.dequeue() + "\n");
                    break;
                case "size":
                    bw.write(q.size() + "\n");
                    break;
                case "empty":
                    bw.write(q.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    bw.write(q.isEmpty() ? "-1\n" : q.getFront() + "\n");
                    break;
                case "back":
                    bw.write(q.isEmpty() ? "-1\n" : q.getRear() + "\n");
                    break;
            }
        }

        bw.flush();
    }
}


class MyQueue<E> {

    private int size = 0;
    private Node<E> frontNode = null;
    private Node<E> rearNode = null;

    public static class Node<E> {
        E item;
        Node<E> next;
        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }

    }

    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element, null);

        if (size == 0) frontNode = newNode;
        else rearNode.next = newNode;
        rearNode = newNode;
        size++;
    }

    public E dequeue() {
        if (size == 0)
            throw new NoSuchElementException("Queue is empty.");

        E item = frontNode.item;
        frontNode = frontNode.next;
        if (frontNode == null)
            rearNode = null;
        size--;
        return item;
    }

    public E getFront() {
        return frontNode.item;
    }

    public E getRear() {
        return rearNode.item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}