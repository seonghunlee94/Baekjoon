import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();

        while (N-- > 0) {
            String[] cmd = br.readLine().split(" ");

            switch (cmd[0]) {
                case "push":
                    dq.offerLast(Integer.parseInt(cmd[1]));  // 뒤에 넣기
                    break;
                case "pop":
                    bw.write(dq.isEmpty() ? "-1\n" : dq.pollFirst() + "\n"); // 앞에서 꺼내기
                    break;
                case "size":
                    bw.write(dq.size() + "\n");
                    break;
                case "empty":
                    bw.write(dq.isEmpty() ? "1\n" : "0\n");
                    break;
                case "front":
                    bw.write(dq.isEmpty() ? "-1\n" : dq.peekFirst() + "\n"); // 앞 값 확인
                    break;
                case "back":
                    bw.write(dq.isEmpty() ? "-1\n" : dq.peekLast() + "\n");  // 뒤 값 확인
                    break;
            }
        }

        bw.flush();
    }
}
