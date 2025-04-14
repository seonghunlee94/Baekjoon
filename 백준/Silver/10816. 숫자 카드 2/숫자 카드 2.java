import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Map<Integer, Integer> cardCountMap = new HashMap<>();

        // 숫자 카드의 개수를 센다
        for (int i = 0; i < N; i++) {
            int card = scanner.nextInt();
            cardCountMap.put(card, cardCountMap.getOrDefault(card, 0) + 1);
        }

        int M = scanner.nextInt();
        StringBuilder result = new StringBuilder();

        // 숫자 카드의 빈도를 출력한다
        for (int i = 0; i < M; i++) {
            int query = scanner.nextInt();
            result.append(cardCountMap.getOrDefault(query, 0)).append(" ");
        }

        // 결과 출력
        System.out.println(result.toString().trim());

        scanner.close();
    }
}