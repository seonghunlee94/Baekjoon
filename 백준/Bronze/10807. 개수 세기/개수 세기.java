import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] numList = new int[N];

        for (int i = 0; i < N; i++) {

            numList[i] = sc.nextInt();

        }
        int M = sc.nextInt();
        int result =0;

        for (int i = 0; i < N; i++) {

            if (numList[i] == M ) {
                result++;
            }
        }

        System.out.println(result);
    }
}