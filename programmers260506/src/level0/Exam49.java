package levle0.d260506;

public class Exam49 {//개미군단
	public static void main(String[] args) {
		System.out.println(solution(23));
		System.out.println(solution(24));
		System.out.println(solution(999));
	}
	public static int solution(int hp) {
		
		int antNum = 0;
		
		if(hp>=5) {
			antNum += (hp/5);
			hp %= 5;
		}
		
		if(hp>=3) {
			antNum += (hp/3);
			hp %= 3;
		}
		
		if(hp>=1){
			antNum += hp;
			hp = 0;
		}
		
		return antNum;
	}

}
