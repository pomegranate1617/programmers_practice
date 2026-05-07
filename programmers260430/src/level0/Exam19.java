package level0;

public class Exam19 {//각도기
	public static void main(String[] args) {
		System.out.println(solution(70));
	}
	public static int solution(int angle) {
		if(angle>0 && angle<90) {
			return 1;
		}
		else if(angle == 90) {
			return 2;
		}
		else if(angle <180){
			return 3;
		}
		else{
			return 4;
		}
	}
}
