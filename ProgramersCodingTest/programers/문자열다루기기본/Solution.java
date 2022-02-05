package 문자열다루기기본;

public class Solution {
	
    public boolean solution(String s) {
        
        if(s.length() == 4 && s.length() == 6){
            try{
                int temp = Integer.parseInt(s);
                return true;
                
            }catch(Exception e){
                return false;
            }
            
        }else {
        	return false;
        }
    }
}

// ① 우선 문자열 길이가 4또는 6이 아니면 false를 리턴하게 해줍니다. if(s.length() != 4 && s.length() != 6) { return false; }

// ② else 문에서는 해당 문자열이 숫자만있는지 문자와 섞여 있는지를 판단해 전부 숫자면 true, 문자가 섞여있으면 false를 return 하도록 합니다. 

// ③ 이 때 try catch 문을 사용해 Integer.parseInt(s); 로 문자열을 정수로 형변환 했을 때, 전부 숫자의 경우는 형변환이 정상적으로 되어 Exception이 발생하지 않기 때문에 catch문을 타지않고 기본 초기화 값인 true로 return 됩니다.

// ④ 하지만 문자가 섞여 있을 경우에는 Integer.parseInt(s); 에서 Exception이 발생하기 때문에 catch문을 타게되어 false로 리턴됩니다.