import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int i;
        char ch;
        String result = "";

        for (i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                result = result + Character.toLowerCase(ch);
            }else {
                result = result + Character.toUpperCase(ch);
            }
        }

        System.out.println(result);

    }
}