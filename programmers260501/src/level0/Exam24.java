package level0;

public class Exam24 {//점의 위치 구하기
	public static void main(String[] args) {
		
	}
	public static int solution(int[] dot) {
			if(dot[0]>0 && dot[1]>0) {
				return 1;
			}
			else if(dot[0]<0 && dot[1]>0) {
				return 2;
			}
			else if(dot[0]<0 && dot[1]<0) {
				return 3;
			}
			else if(dot[0]>0 && dot[1]<0) {
				return 4;
			}
			return 0;
	}
}
