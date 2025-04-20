import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        // 1. Binary Search를 적용하기 위해 정렬한다.
        Arrays.sort(arr);

        int count = 0;
        while (M-- > 0) {
            String x = sc.next();

            // 2. arr에 x가 있는지 확인한다.
            if (Arrays.binarySearch(arr, x) >= 0) // 값이 있는 경우 인덱스 리턴
                count++;
            
        }

        System.out.println(count);
    }
}
