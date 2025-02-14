import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {

            String[] line = br.readLine().split(" ");

            int num1 = Integer.parseInt(line[0]);
            int num2 = Integer.parseInt(line[1]);

            bw.write(num1 + num2 + "\n");

        }

        bw.flush();

    }
}

