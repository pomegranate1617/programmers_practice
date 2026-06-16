package leve1.d260514;

public class Exam26 {//부족한 금액 계산하기
	public static void main(String[] args) {
		System.out.println(solution(3,20,4));
		System.out.println(solution(1,2,1));
	}
	
	public static long solution(int price,int money,int count) {
		long totalPrice = 0;
		
		for(int i=1;i<=count;i++) {
			totalPrice += (price * i);
		}
		
		long change = money - totalPrice;
		
		if(change>=0) {
			return 0;
		}else {
			return Math.abs(change);
		}
	}
}
