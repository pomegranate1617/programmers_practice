package levle0.d260506;

public class Exam46 {//옷가게 할인 받기
	public static void main(String[] args) {
		System.out.println(solution(150000));
		System.out.println(solution(580000));
	}
	public static int solution(int price) {
		
		if(price>=100000 && price<300000) {
			price *= 0.95;
		}else if(price>=300000 && price<500000) {
			price *= 0.9;
		}else if(price>=500000){
			price *= 0.8;
		}
		
		return (int)price;
	}
}
