import java.util.Scanner;

public class Main {

    public static int moveStep(int num, char operator, int step) {

        switch (operator) {
            case '+':
                num += step;
                break;
            case  '-':
                num -= step;
                break;
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] size = sc.nextLine().split(" ");
        String[] initialCoordinates = sc.nextLine().split(" ");
        int t = sc.nextInt();


        int w = Integer.parseInt(size[0]);
        int h = Integer.parseInt(size[1]);

        int wTime = t % (2 *w);
        int hTime = t % (2 *h);

        int p = Integer.parseInt(initialCoordinates[0]);
        int q = Integer.parseInt(initialCoordinates[1]);

        char wDirection = 'R'; // 'L'
        char hDirection = 'U'; // 'D'

        int stepP;
        int stepQ;
        char operator;

        while (wTime > 0) {

            if (wDirection == 'R') {
                stepP = w - p;
                wDirection = 'L';
                operator = '+';

            } else {
                stepP = p;
                operator = '-';
                wDirection = 'R';
            }

            if (wTime <= stepP) {
                stepP = wTime;
            }

            p = moveStep(p ,operator, stepP);

            wTime -= stepP;

        }

        while (hTime > 0) {
            if (hDirection == 'U') {
                stepQ = h - q;
                hDirection = 'D';
                operator = '+';

            } else {
                stepQ = q;
                operator = '-';
                hDirection = 'U';
            }

            if (hTime <= stepQ) {
                stepQ = hTime;
            }

            q = moveStep(q ,operator, stepQ);

            hTime -= stepQ;

        }

        System.out.printf("%d %d", p, q);
    }

}