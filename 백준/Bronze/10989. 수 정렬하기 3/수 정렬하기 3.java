import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // 첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
        int[] cnt = new int[10001];

        while (N-- > 0) {
            cnt[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 0; i < 10001; i++) {
            while (cnt[i]-- > 0) {
                bw.write(i + "\n");
            }
        }

        bw.flush();

    }
}