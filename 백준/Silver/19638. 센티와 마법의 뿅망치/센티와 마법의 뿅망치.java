import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int T = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        while(N-- > 0) {
            int bigH = sc.nextInt();

            pq.offer(bigH);
        }

        int i;
        int giantH;
        for (i = 0; i < T; i++) {
            giantH = pq.poll();

            if (H > giantH) {
                pq.offer(giantH);
                break;
            }

            if (giantH != 1) giantH /= 2;
            pq.offer(giantH);
        }

        giantH = pq.poll();

        if (H > giantH) {
            System.out.println("YES");
            System.out.println(i);
        } else {
            System.out.println("NO");
            System.out.println(giantH);
        }


    }
}

