import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] ch = sc.next().toCharArray();
        char[] changCh = ch ;

        for (int i =0; i < ch.length; i++) {
            if (ch[i] >= 65 && ch[i] < 91) {
                changCh[i] = (char)(ch[i] + 32);
            }

            else if (ch[i] >= 97 && ch[i] < 122) {
                changCh[i] = (char)(ch[i] - 32);
            }

            System.out.print(changCh[i]);
        }

    }
}