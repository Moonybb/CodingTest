package 핸드폰번호가리기;

public class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String[] numberArr = phone_number.split("");
        
        for(int i=0; i<numberArr.length; i++){
            if(i < numberArr.length - 4){
                answer += "*";
            }else {
                answer += numberArr[i];
            }
        }
        
        return answer;
    }
}

// 1. 먼저 split() 메서드를 사용해 문자열의 각 문자를 배열에 담습니다.

// 2. 담은 배열의 길이만큼 반복문을 돌립니다.

// 3. 돌아가는 반복문 i 의 값이 길이 - 4 보다 작을 때에는 "*" 을 더하고, answer += "*";

// 4. 같거나 클때는 해당 배열의 i 인덱스 값을 더하여 return 합니다. answer += numberArr[i] 



//https://devmoony.tistory.com/106?category=939501 [무니의 개발 로그]