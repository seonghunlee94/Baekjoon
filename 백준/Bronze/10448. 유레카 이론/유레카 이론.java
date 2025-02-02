import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int triangularNum = 0;
        int[] triangularList = new int[44];

        for (int i = 1; i < 45; i++) {

            triangularNum += i;
            triangularList[i-1] = triangularNum;

        }

//        System.out.println(Arrays.toString(triangularList));

        int T = sc.nextInt();
        boolean[] checked = new boolean[T];
        int start = 0;
        int end = 43;
        
        while (T > 0) {

            int num = sc.nextInt();

            for (int i=0; i < 43; i++) {

//                System.out.println("-----------------------");

                while (start <= end) {
//                    System.out.println(triangularList[end]);

                    if (num == triangularList[i] + triangularList[start] + triangularList[end]) {
                        checked[T-1] = true;
                        break;
                    } else if (num > triangularList[i] + triangularList[start] + triangularList[end]) {
                        start++;
                    } else {
                        end--;
                    }
                }
                start = 0;
                end = 43;

                if (checked[T-1] == true) {
                    System.out.println(1);
//                    System.out.println("-----------------------");
                    break;
                }

            }

            if (checked[T-1] == false) {
                System.out.println(0);
            }
            T--;

        }

    }
}