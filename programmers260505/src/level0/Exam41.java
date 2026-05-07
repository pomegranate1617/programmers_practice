package level0;

public class Exam41 {//falg에 따라 다른 값 반환하기
	public static void main(String[] args) {
		System.out.println(solution(-4,7,true));
		System.out.println(solution(-4,7,false));
	}
	public static int solution(int a,int b,boolean flag) {
		if(flag == true) {
			return a + b;
		}else {
			return a - b;
		}
	}
}
