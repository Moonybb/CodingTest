package 서울에서김서방찾기;

class Solution {
	
    public String solution(String[] seoul) {
        String answer = "";

        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                return "김서방은 "+i+"에 있다";
            }
        }
        return answer;
    }
}

//① 먼저 seoul 배열의 길이를 확인 후 그 길이만큼 for문을 돌립니다.

//② for문이 1회 돌때마다 증가하는 i 값을 이용하여 seoul[i].equals("Kim"); 으로 seoul[i]의 값이 "Kim"과 같을 때 answer을 결과 양식대로 초기화하여 return합니다.