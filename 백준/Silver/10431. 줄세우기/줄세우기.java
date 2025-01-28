import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // P 테스트 케이스
        int P = sc.nextInt();
        int backStepCount = 0;
        int order = 0;
        int[] lineList = new int[20];
        int temp;
        while (P-- > 0) {


            order = sc.nextInt();

            for (int i=0; i < 20; i++) {

                lineList[i] = sc.nextInt();
                
                for (int j = i-1; j >= 0; j--) {

                    if (lineList[j] > lineList[j+1]) {
                        backStepCount++;
                        temp = lineList[j+1];
                        lineList[j+1] = lineList[j];
                        lineList[j] = temp;
                    }

                }
            }

            System.out.println(order + " " + backStepCount);

            backStepCount = 0;
        }

    }

}