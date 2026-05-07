package level1;

public class Exan11 {//나머지가 1이 되는 수 찾기
	public static void main(String[] args) {
		System.out.println(solution(10));
		System.out.println(solution(12));
	}
	public static int solution(int n) {
		
		int result = -1;
		
		for(int i=1;i<=n;i++) {
			if(n%i == 1) {
				result = i;
				break;
			}
		}
		
		return result;
	}

}
