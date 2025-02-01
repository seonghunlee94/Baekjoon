import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] list = new int[9];
        int n = 0;
        int sum = 0;
        while (n < 9) {
            list[n] = sc.nextInt();
            sum += list[n];
            n++;
        }

        Arrays.sort(list);

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {

                if (sum - list[i] - list[j] == 100) {

                    for (int k = 0; k < n; k++) {

                        if (k != i && k != j) {
                            System.out.println(list[k]);
                        }

                    }
                    
                    return;


                }

            }
        }

    }
}