import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        boolean[] checkNum = new boolean[2000001];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            checkNum[num+1000000] = true;
        }

        for (int i = 0; i < checkNum.length; i++) {
            if (checkNum[i] == true) {
                bw.write(i - 1000000 + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}