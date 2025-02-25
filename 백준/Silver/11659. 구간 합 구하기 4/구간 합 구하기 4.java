import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] numList = new int[N+1];

        int sum = 0;
        for (int i = 1; i <= N; i++) {

            sum += sc.nextInt();
            numList[i] = sum;

        }

        while (M-- > 0) {

            int i = sc.nextInt();
            int j = sc.nextInt();

            System.out.println(numList[j] - numList[i-1]);

        }

    }
}