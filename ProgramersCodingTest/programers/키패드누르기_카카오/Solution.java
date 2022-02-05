package 키패드누르기_카카오;

class Solution {
	
    public String solution(int[] numbers, String hand) {
        
        StringBuilder sb = new StringBuilder();
        
        int leftHand = 10;
        int rightHand = 12;
        
        for(int number : numbers) {
            
            if(number == 0) number = 11; 
            
            switch(number % 3) {
            case 0 :  // right
                rightHand = number;
                sb.append("R");
                break;
                
            case 1 :  // left
                leftHand = number;
                sb.append("L");
                break;
                
            case 2 :  // middle
                
                int calL = leftHand - number;
                if(calL < 0) calL = calL * -1;
                
                int calR = rightHand - number;
                if(calR < 0) calR = calR * -1;
                
                int distanceL = (calL % 3) + (calL / 3);
                int distanceR = (calR % 3) + (calR / 3);
                
                if(distanceL < distanceR) {
                    leftHand = number;
                    sb.append("L");
                }else if(distanceL > distanceR) {
                    rightHand = number;
                    sb.append("R");
                }else {
                    if("left".equals(hand)){
                        leftHand = number;
                        sb.append("L");
                    }else {
                        rightHand = number;
                        sb.append("R");
                    }
                }
                break;
            }
        }
        return sb.toString();
    }
}


/*
- 문자열을 계속 추가해주는 연산이 필요한데 문자열 객체(String)과 문자열 객체(String)을 계속 연산하게 되면 메모리 할당과 메모리 해제를 발생시켜 연산이 많아질수록 성능저하를 일으킬 수 있어서 StringBuilder를 활용하였다.
- 번호와의 거리 = ((현재번호 - 누를번호) % 3) + ((현재번호 - 누를번호) / 3);


1. 초기에 왼손은 *, 오른손은 #에 위치해 있기 때문에 각각 10, 12로 초기화 한다.

2. 또 변수로 들어오는 number가 0일 경우에는 11로 변환 후 시작한다.

3. number % 3 의 값이 1이면 왼손으로 누르고, 2이면 가까운 손으로, 0이면 오른손으로 누른다. 

4. 왼손(1) 또는 오른손(0)의 경우는 손의 위치를 초기화 후 StringBuilder에 왼손이면 "L", 오른손이면 "R"을 append 한다.

5. 가까운손(2)일 경우 어느 손이 가까운지 확인한다. 번호와의 거리가 같다면 왼손잡이인지, 오른손잡이에 따라 결과가 정해진다.
*/


// https://devmoony.tistory.com/126?category=939501 [무니의 개발 로그]