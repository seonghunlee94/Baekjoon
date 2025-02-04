import java.util.Arrays;
import java.util.Scanner;

public class Main {


    static boolean[] sumTwoTriangle = new boolean[1001];
    static boolean[] eurekaNumber = new boolean[1001];

    public static void sumTowTriangle (int[] triangleList) {

        int num = 0;
        for (int i = 1; i < triangleList.length; i++) {
            for (int j = 1; j < triangleList.length; j++) {
                num = triangleList[i] + triangleList[j];
                if (num < 1000) sumTwoTriangle[num] = true;
            }
        }

    }

    public static void checkEureka (int[] triangleList) {

        int num = 0;

        for (int i = 1; i < sumTwoTriangle.length; i++) {
            if (sumTwoTriangle[i] == true)
                for (int j = 1; j < triangleList.length; j++) {
                    num = i + triangleList[j];
                    if (num < 1001) eurekaNumber[num] = true;
                }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 삼각수 리스트 구하기.
        int[] triangleList = new int[45];
        for (int i = 1; i < 45; i++) {
            int num = i * (i + 1) / 2;
            if (num < 1001) triangleList[i] = num;
        }

        // 세 개의 삼감수의 합이 1000 이하인 경우.
        // 1. 두 삼각수의 합으로 1~999까지의 나올 수 있는 수 구하기.
        sumTowTriangle(triangleList);

        // 2. 합으로 나온 값에 삼각수 값을 더해 유레카 찾기.
        checkEureka(triangleList);

        int T = sc.nextInt();

        while (T-- > 0) {

            int K = sc.nextInt();

            if (eurekaNumber[K] == true) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }

    }
}