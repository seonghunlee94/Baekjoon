import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] numList = new int[N];
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {

            numList[i] = sc.nextInt();

        }
        int count = 0;
        for (int i = N-1; i > 0; i--) {
            int index = i-1;

            for (int j = i; j >= 0; j--) {

                if (numList[j] > numList[index]) {
                    index = j;
                }

            }
            if (numList[i] < numList[index]) {

                int temp = numList[i];
                numList[i] = numList[index];
                numList[index] = temp;

                count++;

                result.add(numList[index] + " " + numList[i]);

            }

        }

        if (K <= count) {
            System.out.println(result.get(K-1));
        } else {
            System.out.println(-1);
        }
    }
}

