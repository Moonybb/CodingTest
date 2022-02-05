package 숫자문자열과영단어;

public class Solution {
    public int solution(String s) {
        
        String[] wordCaseArr = new String[]{"zero", "one", "two", "three", "four",
                                        "five", "six", "seven", "eight", "nine"};
        
        for(int i=0; i<wordCaseArr.length; i++){
            s = s.replaceAll(wordCaseArr[i], String.valueOf(i));
        }
        
        return Integer.parseInt(s);
    }
}

//1. "zero" 부터 "nine"까지 wordCaseArr[10] 배열에 담아놓는다.

//2. 반복문을 통해 replaceAll을 하여 각 단어가 있으면 해당되는 값으로 변경된다.
	/* 여기서 반복될 때 zero ~ nine까지 돌게되는데 이 때 i의 값도 마찬가지로 0 ~ 9가 된다. */
    /* replaceAll의 두번째 인자에 그냥 i를 주게되면 알아서 문자열로 인식하여 변경되지 않기 때문에 String.valueOf() 메서드를 사용한다. */

//3. return type이 int이므로 Integer.parseInt() 메서드를 활용해 return


// https://devmoony.tistory.com/119?category=939501 [무니의 개발 로그]