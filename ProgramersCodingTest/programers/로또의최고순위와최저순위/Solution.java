package 로또의최고순위와최저순위;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        
        int answerCnt = 0;
        int zeroCnt = 0;
        
        for(int i=0; i<6; i++){
            
            // 알아볼 수 없는 번호의 개수 체크            
            if(lottos[i] == 0){
                zeroCnt++;
            }
            
            for(int j=0; j<6; j++){
                if(win_nums[i]==lottos[j]){
                    answerCnt++;
                }
            }
        }
        
        int maxTemp = answerCnt + zeroCnt;
        int minTemp = answerCnt;
        
        int maxRank = checkRank(maxTemp);
        int minRank = checkRank(minTemp);
        
        int[] answer = {maxRank, minRank};
        
        return answer;
    }
    
    public int checkRank(int cnt){
        int result = 0;
        switch(cnt) {
            case 6 : result = 1; break;
            case 5 : result = 2; break;
            case 4 : result = 3; break;
            case 3 : result = 4; break;
            case 2 : result = 5; break;
            default : result = 6; break;
        }
        return result;
    }
}


// ① 먼저 알아볼 수 없는 개수와 정답인 개수를 파악합니다.

// ② 알아볼 수 없는 번호가 전부 정답이라고 가정한 개수와 전부 오답이라고 가정한 개수를 파악합니다.

// ③ checkRank(cnt) 라는 공통 메서드를 선언하여 최고 순위 및 최저 순위를 return 받습니다.

// ④ int[] answer = {maxRank, minRank}; 를 통해 정답을 제출합니다.


// https://devmoony.tistory.com/98?category=939501 [무니의 개발 로그]