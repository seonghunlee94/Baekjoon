import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = Integer.parseInt(sc.nextLine());

        String text = "";

        while (T-- > 0) {
            text = sc.nextLine();
            System.out.print(text.charAt(0));
            System.out.println(text.charAt(text.length()-1));
        }

    }
}