import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        int lastVal = -1;

        while (n-- > 0) {

            String[] cmd = br.readLine().split(" ");

            switch (cmd[0]) {
                case "push":
                    lastVal = Integer.parseInt(cmd[1]);
                    q.offer(lastVal);
                    break;
                case "pop":
                    bw.write((q.size() == 0 ? -1 : q.poll()) + "\n");
                    break;
                case "size":
                    bw.write((q.size()) + "\n");
                    break;
                case "empty":
                    bw.write((q.size() == 0? 1 : 0) + "\n");
                    break;
                case "front":
                    bw.write((q.size() == 0 ? -1 : q.peek()) + "\n");
                    break;
                case "back":
                    bw.write((q.size() == 0 ? -1 : lastVal) + "\n");
                    break;
            }

        }

        bw.flush();

    }
}