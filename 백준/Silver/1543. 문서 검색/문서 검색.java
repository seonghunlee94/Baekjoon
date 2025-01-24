import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String word = sc.nextLine();

        int textInCount = 0;


        for (int i = 0; i <= text.length() - word.length(); i++) {

            for (int j=0; j < word.length(); j++) {

                if (text.charAt(i+j) != word.charAt(j)) {
                    break;
                }

                if (j == word.length()-1) {
                    textInCount++;
                    i = i + j;
                }
            }
        }

        System.out.println(textInCount);

    }

}