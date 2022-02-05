package 문자열내p와y의개수;

public class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int pCnt = 0;
        int yCnt = 0;
        
        String lowerS = s.toLowerCase();
        String[] sArr = lowerS.split("");
        
        for(int i=0; i<sArr.length; i++) {
        	if(sArr[i].equals("p")) {
        		pCnt++;
        	}else if(sArr[i].equals("y")) {
        		yCnt++;
        	}
        }
        
        if(pCnt == yCnt) {
        	answer = true;
        }else {
        	answer = false;
        }
        
        return answer;
    }
}

// ① 먼저 toLowerCase()를 사용해 전부 소문자로 변경해주고 split("")으로 각 문자마다 잘라 String배열에 담아 배열 길이만큼 반복문을 돌리기로 했습니다.

// ② 받은 배열의 길이만큼 반복문을 생성하고 0부터 반복될 때마다 1씩 증가하는 i 값을 사용해 배열의 index값으로 주어 equals("p") , equlas("y") 로 p, y일 때 각각 카운트를 증가하게 합니다.

// ③ 반복문이 끝나면 아래서 p의 개수와 y의 개수를 비교하여 answer에 담아줍니다. if(pCnt == yCnt){ answer = true; } else{ answer = false; }