package 가운데글자가져오기;

class Solution {
    public String solution(String s) {
        String answer = "";
		
		if(s.length()%2 == 0) {
			int temp = s.length()/2;
			answer = s.substring(temp-1, temp+1);
			
		}else {
			int temp = s.length()/2;
			answer = s.substring(temp, temp+1);
		}
		
		return answer;
    }
}
	
//	① 먼저 문자열 개수가 짝수는 2글자 홀수는 1글자를 return하라고 되어 있으니 s.length()를 2로 나눈 나머지 값이 0인 경우(짝수)와 그렇지 않은 경우로 나눕니다. if(s.length()%2 == 0) { ... } else{ ... }

//	② 짝수인 경우 홀수인 경우 모두 s.length()/2; 를 하였을 때 / 는 몫만 return 되기 때문에 나누어 홀수인경우는 내림 되어 값을 temp에 참조합니다. ex) 5/2 = 2

//	③ 이후 substring() 메서드를 활용하여 짝수인 경우는 s.substring(temp-1, temp+1); 

//	④ 홀수인 경우는 s.subString(temp, temp+1); 을하여 answer에 참조 저장합니다.