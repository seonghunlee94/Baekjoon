
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();

        int[] countA = new int[26];
        int[] countB = new int[26];

        word1 = word1.toUpperCase();
        word2 = word2.toUpperCase();

        for (int i = 0; i < word1.length(); i++) {
            int x = word1.charAt(i) - 65;
            countA[x] += 1;
        }

        for (int j = 0; j < word2.length(); j++) {
            int y = word2.charAt(j) - 65;
            countB[y] += 1;
        }

        int num = 0;
        for (int n = 0; n < 26; n++) {
            num += Math.abs(countA[n] - countB[n]) ;
        }

        System.out.println(num);

    }
}