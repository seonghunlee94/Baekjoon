
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word = word.toUpperCase();

        int[] alpabetCount = new int[26];
        int maxCount = 0;
        char maxAlpabet = '?';

        for (int i=0; i < word.length(); i++) {
            alpabetCount[word.charAt(i) - 'A']++;
        }

        for (int j=0; j < 26; j++) {
            if (alpabetCount[j] > maxCount) {
                maxCount = alpabetCount[j];
                maxAlpabet = (char)(j + 'A');
            } else if (alpabetCount[j] == maxCount) {
                maxAlpabet = '?';
            }
        }

        System.out.println(maxAlpabet);

    }


}