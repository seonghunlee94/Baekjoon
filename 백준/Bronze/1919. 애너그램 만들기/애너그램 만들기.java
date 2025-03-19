import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String word1 = sc.next();
        String word2 = sc.next();

        int[] alpabetCount1 = new int[26];
        int[] alpabetCount2 = new int[26];

        int delWord = 0;

        for (int i = 0; i < word1.length(); i++) {
            alpabetCount1[word1.charAt(i) - 97]++;
        }
        for (int i = 0; i < word2.length(); i++) {
            alpabetCount2[word2.charAt(i) - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            delWord += Math.abs(alpabetCount1[i] - alpabetCount2[i]);
        }

        System.out.println(delWord);
    }
}