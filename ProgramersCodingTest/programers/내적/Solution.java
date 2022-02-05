package 내적;

public class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i=0; i<a.length; i++){
            answer += a[i]*b[i];
        }
        
        return answer;
    }
}

// return하는 answer 변수에 규칙에 맞게  a[i] * b[i] 를 중첩덧셈하여 리턴

// https://devmoony.tistory.com/105?category=939501 [무니의 개발 로그]