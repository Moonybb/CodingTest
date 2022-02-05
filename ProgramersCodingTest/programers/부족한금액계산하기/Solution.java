package 부족한금액계산하기;

public class Solution {
    public long solution(int price, int money, int count) {
        
        long totalPrice = 0;	// 총 이용금액
        
        for(int i=1; i<=count; i++){
            totalPrice += price * i;
        }
        
        return (money - totalPrice) >= 0 ? 0 : (money - totalPrice) * -1;
    }
}