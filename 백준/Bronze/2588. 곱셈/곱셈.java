import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int splitNum1 = num2 % 10;
        int splitNum2 = num2 % 100 - splitNum1;
        int splitNum3 = num2 - splitNum1 - splitNum2;

        int result1 = num1 * splitNum1;
        int result2 = num1 * splitNum2;
        int result3 = num1 * splitNum3;
        int result = result1 + result2 + result3;

        System.out.println(result1);
        System.out.println(result2 / 10);
        System.out.println(result3 / 100);
        System.out.println(result);

    }
}