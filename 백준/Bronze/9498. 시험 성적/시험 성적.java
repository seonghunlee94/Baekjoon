import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();
        char grade;

        if (90 <= score && score <= 100) {
            grade = 'A';
        } else if (80 <= score && score < 90 ) {
            grade = 'B';
        } else if (70 <= score && score < 80 ) {
            grade = 'C';
        } else if (60 <= score && score < 70 ) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println(grade);


    }
}