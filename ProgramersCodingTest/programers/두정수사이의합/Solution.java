package 두정수사이의합;

public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int temp = a-b;
        
        if(temp < 0){
            answer = func(a, b);
        } else if(temp > 0){
            answer = func(b, a);
        } else{
            answer = a;
        }
        
        return answer;
    }
    
    public long func(int a, int b){
        long result = 0;
        for(int i=a; i<=b; i++){
            result += i;
        }
        return result;
    }
}


// 1. int temp = a-b; 를 통해 대소 구분을 하여 분기처리

// 2 - 1. temp가 0보다 크다는 것은 a가 b보다 크다는 의미이므로 메서드를 호출할 때 func(a, b)로 호출

// 2 - 2. temp가 0보다 작다는 것은 a가 b보다 작다는 의미이므로 메서드를 호출할 때 func(b, a)로 호출

// 2 - 3. 그 외엔 a와 b가 같으므로 둘 중 아무거나 return

// 3. func(int a, int b) 메서드는 a부터 b까지 1씩 증가하며 더한 값을 long result에 담아 return

// 4. solution 메서드에서 받아 결과 return


// https://devmoony.tistory.com/87?category=939501 [무니의 개발 로그]