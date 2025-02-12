import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<String> entered = new TreeSet<>();
        String name;

        for (int i = 0; i < N; i++) {
            name = sc.next();
            if (sc.next().equals("enter")) {
                entered.add(name);
            } else {
                entered.remove(name);
            }
        }

        String[] orderedAnswer = entered.toArray(new String[entered.size()]);
        for (int i = orderedAnswer.length - 1; i >= 0; i--)
            System.out.println(orderedAnswer[i]);

    }
}
