package 크레인인형뽑기게임_카카오;

import java.util.Stack;

public class Solution {
    public int solution(int[][] board, int[] moves) {
       int answer = 0;
		Stack<Integer> stack = new Stack<Integer>();
		int moveLeng = moves.length; 
		int boardLeng = board[0].length;
		
		for(int i=0; i<moveLeng; i++) {
			
			int move = moves[i]-1;

			for(int j=0; j<boardLeng; j++) {
				int selKakao = board[j][move];
				
				if(selKakao > 0) {
					
					int basketKakao=0;
					if(stack.size() > 0) {
						basketKakao = stack.peek();
					}
					
					if(basketKakao == selKakao) {
						stack.pop();
						answer += 2;
					}else {
						stack.push(selKakao);
					}
					board[j][move] = 0; 
					break;
				}
			}
		}
		
		return answer;
    }
}

// ① 우선 뽑는 횟수, 보드의 행, 열 길이 등을 확인하여 for문 조건 또는 배열 index 값으로 활용하였고,

// ② 우선 뽑는 횟수만큼 도는 for문 선언 후 바로 안쪽에 int move = moves[i]-1;를 초기화 하여 board 배열의 index값으로 활용합니다.

// ③ for문 안쪽에 for(int j=0; j<boardLeng; j++) { 는 뽑는 행은 알았으니 열이 0부터 보드 판의 열 개수만큼 돌게 해줍니다. 

// ④ int selKakao = board[j][move]; 를 통해 인형을 확인하면서 반복문이 돌다가 selKakao의 값이 0보다 크면 (해당 행의 가장 위에있는 인형이 있다는 뜻) if(selKakao > 0)

// ⑤ 우선 뽑은 인형을 Stack에 push(삽입) 하기 이전에 기존 바구니(Stack)의 사이즈가 0보다 클 때 가장 늦게 들어간 인형을 확인합니다. basketKakao = stack.peek();

// ⑥ 최근 바구니에 들어간 인형과 방금 뽑은 인형의 종류가 같으면 if(basketKakao == selKakao) 스택(Stack)의 pop()메서드를 이용해 최근 바구니에 들어간 인형을 삭제해주고 answer(터진 인형 개수)의 값을 +2 해줍니다. answer += 2;

// ⑦ 하지만 종류가 다르다면 else , push(item)메서드를 활용해 바구니에 넣어줍니다. stack.push(selKakao);

// ⑧ 이후 공통적으로 인형을 뽑았다면 해당위치의 인형을 제거해줍니다. board[j][move] = 0;

// ⑨ break; -> 해주는 이유는 인형을 뽑았을 때 그 아래의 열을 굳이 확인해서 인형을 뽑을 필요가 없기 때문에 break;를 통해 해당 안쪽 for문을 종료 시키고 i값이 증가된 바깥쪽 for문을 다시 돌게 하기 위함입니다.



// https://devmoony.tistory.com/55?category=939501 [무니의 개발 로그]