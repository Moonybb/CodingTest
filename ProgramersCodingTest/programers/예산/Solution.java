package 예산;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++){
            if(d[i] <= budget){
                budget = budget-d[i];
                answer++;
            }else{
                break;
            }
        }
        
        return answer;
    }
}

// ① 먼저 지원 금액이 작은 순으로 d배열을 오름차순 정렬해 줍니다.
// 👉지원 금액이 작은 순서부터 비교해주어야 최대한 많은 부서에게 지원이 가능하므로(조건)

// ② 반복문(부서 개수만큼)을 통해 지원금액의 100% 지원이 가능한 경우 예산에서 차감합니다.

// ③ 예산에서 차감 이후 answer 카운트 1 증가시키고 return 해줍니다.


// https://devmoony.tistory.com/99?category=939501 [무니의 개발 로그]