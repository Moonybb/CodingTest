package 수박수박수박수박수박수;

class Solution {
    public String solution(int n) {
        String answer = "";
        
        for(int i=0; i<n; i++){ 
            if(i%2==0){
                answer+="수";
            }else{
                answer += "박";
            }
        }
        return answer;
    }
}

// ① 먼저 n이 4이면 "수박수박" n이 3이면 "수박수"를 리턴하라고 명시에 따라 n의 수만큼 반복문을 돌립니다.

// ② 이후 i값이 0부터 증가하게 설정하였습니다. 그럼 처음 반복문이 돌때 i가 0으로 돌기 때문에 if의 조건을 if(i%2 == 0)으로 하였습니다. (이렇게 해야 첫번째 반복문에서 "수"로 시작하기 때문에)

// ③ 반복될 때마다 조건문을 타게돼서 answer에 += 연산자를 통해 수, 박, 수, 박 순으로 n의 개수만큼 추가된 값을 return하게 됩니다.