package 문자열내림차순으로배치하기;

import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] stringArr = s.toCharArray();
        Arrays.sort(stringArr);

        answer = new StringBuilder(new String(stringArr)).reverse().toString();
        return answer;
    }
}

// ① s.toCharArray() toCharArray() 메서드를 활용하여 파라미터로 넘어온 s를 char단위로 1개씩 쪼개서 char[] charArr 로 return 받습니다.

// ② java.util.Arrays 를 import하여 Arrays.sort(charArr) 로 문자열을 오름차순으로 정렬합니다. 여기서 따로 return 받지 않아도 charrArr는 오름차순으로 정렬됩니다.

// ③ 오름차순으로 정렬된 charArr을 StringBulder를 활용해 answer = new StringBuilder(new String(charArr)) 로 받는데 reverse() 메서드를 활용해 오름차순으로 정렬된 문자열을 내림차순으로 다시 정렬해 toString() 메서드로 해당 객체의 정보나 값을 참조하게 한 후 answer로 받아 return해 줍니다.