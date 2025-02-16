import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations); // 오름차순 정렬
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i; // 남은 논문의 개수 (역순으로 인용 수를 확인)
            if (citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }
}