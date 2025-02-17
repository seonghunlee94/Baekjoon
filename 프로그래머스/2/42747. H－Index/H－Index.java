import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        
        // 정렬
        
        Arrays.sort(citations);
        
        System.out.println(Arrays.toString(citations));
        
        // h번 이상 인용되면서 h편 이상
        
        for (int i = 0; i < citations.length; i++) {
            
            if (citations[i] >= citations.length - i) {
                System.out.println(citations[i]);
                System.out.println(citations.length - i);
                return citations.length - i;
            }
            
        }
        
        
        
        return 0;
        
        
    }
}