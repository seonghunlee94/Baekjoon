import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] sequenceList = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            sequenceList[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sequenceList);

        int answer = Integer.parseInt(br.readLine());
        int start = 0;
        int end = N-1;
        int sum;

        while (start < end) {
            sum = sequenceList[start] + sequenceList[end];

            if (sum == answer) {
                count++;
                start++;
                end--;
            } else if (sum < answer) {
                start++;
            } else {
                end--;
            }

        }

        System.out.println(count);

    }
}