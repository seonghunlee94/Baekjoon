import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] stack = new int[N];
        int topIndex = -1;

        while (N-- > 0) {
            int cmd = Integer.parseInt(br.readLine());

            if (cmd != 0) {
                stack[++topIndex] = cmd;
            } else {
                stack[topIndex--] = 0;
            }
        }

        int total = 0;
        while (topIndex >= 0) {
            total += stack[topIndex--];
        }

        System.out.println(total);
    }
}