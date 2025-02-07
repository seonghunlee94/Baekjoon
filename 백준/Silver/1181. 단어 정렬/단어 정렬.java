import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] wordList = new String[N];

        for (int i = 0; i < N; i++) {
            wordList[i] = br.readLine();
        }

        Arrays.sort(wordList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length())
                    return o1.compareTo(o2);
                return o1.length() - o2.length();
            }
        });

        bw.write( wordList[0] + "\n");
        for (int i = 1; i < N; i++) {
            if (!wordList[i].equals(wordList[i-1]))
                bw.write(wordList[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}