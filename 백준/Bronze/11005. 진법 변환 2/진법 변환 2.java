import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();
        int A = 0;
        int i = 0;

        String[] result = new String[100];
        String ans = "";


        while (N > 0) {
            A = N % B;
            if (A < 10) result[i] = Integer.toString(A);
            else result[i] = Character.toString((char)(A - 10 + 'A'));

            N = N / B;

            i++;
        }

        for (int j = result.length-1; j >= 0; j--) {
            if (result[j] != null) {
                ans += result[j];
            }
        }

        System.out.println(ans);


    }
}