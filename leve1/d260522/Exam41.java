package leve1.d260522;

public class Exam41 {//푸드 파이트 대회
	public static void main(String[] args) {
		System.out.println(solution(new int[] {1,3,4,6}));
		System.out.println(solution(new int[] {1,7,1,2}));
		System.out.println(solution(new int[] {1,1,1}));
		System.out.println(solution(new int[] {1,20,2,3}));
	}
	
	public static String solution(int[] food) {
		//food[0]는 물의 양(항상1)
		//food배열의 원소를 꺼내서 2로 나눈것이 각 선수가 먹게되는 해당 음식의 양
		//문자열의 양쪽으로 해당 음식의 양만큼 반복하여 음식의 인덱스 추가 =>변경
		//변경 : 문자열이 양쪽으로 대칭이므로 reverse()로 반전하여 합치기
		StringBuilder sb = new StringBuilder();
		//StringBuilder에 매개변수 없을 경우 ""랑 같은 효과
		
		for(int i=1;i<food.length;i++) {
			
			int eachFoodCnt = food[i] / 2;
			
			for(int j=0;j<eachFoodCnt;j++) {
				sb.append(i);
			}
		}
		
		String right = sb.toString();
		sb.reverse();
		
		sb.insert(0 ,right + "0");
		
		return sb.toString();
	}

}
