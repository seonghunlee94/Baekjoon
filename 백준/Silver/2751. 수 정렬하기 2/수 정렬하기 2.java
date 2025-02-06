import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Integer[] numList = new Integer[N];

        for (int i = 0; i < numList.length; i++) {
            numList[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numList);

        for (Integer num: numList) {
            bw.write(num+"\n");
        }

        bw.flush();

    }
}