import java.io.*;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        MyStack<Integer> stack = new MyStack<>();

        while (N-- > 0) {
            int cmd = Integer.parseInt(br.readLine());

            if (cmd != 0) {
                stack.push(cmd);
            } else {
                stack.pop();
            }

        }

        int total = 0;
        while (stack.size() > 0) {

            total += stack.pop();

        }

        System.out.println(total);
    }
}


class MyStack<E> {

    private int size = 0;
    private Node<E> topNode = null;

    public static class Node<E> {
        E item;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }

    // push: 맨 앞에 새 노드를 추가
    public void push(E element) {
        topNode = new Node<>(element, topNode);
        size++;
    }

    // pop: 맨 앞 노드를 제거
    public E pop() {
        if (size == 0)
            throw new NoSuchElementException("Stack is empty.");

        E item = topNode.item;
        topNode = topNode.next;
        size--;
        return item;
    }

    public int size() {
        return size;
    }

}