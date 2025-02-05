import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();

        int ans = 0;

        while (Y > 0) {
            ans += Y;
            Y--;
        }

        System.out.println(ans);
    }
}