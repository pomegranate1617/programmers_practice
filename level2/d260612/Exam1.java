package level2.d260612;

public class Exam1 {//최댓값과 최솟값
	public static void main(String[] args) {
		System.out.println(solution("1 2 3 4"));
		System.out.println(solution("-1 -2 -3 -4"));
		System.out.println(solution("-1 -1"));
		System.out.println(solution("0 -1 -1 3 -2 1"));
		
	}
	
	public static String solution(String s) {
		
		String[] split = s.split(" ");
		
		int max = Integer.parseInt(split[0]);
		int min = Integer.parseInt(split[0]);
		
		for(int i = 1; i < split.length; i++) {
			
			int num = Integer.parseInt(split[i]);
			
			if(num > max) {
				max = num;
			}
			
			if(num < min) {
				min = num;
			}
		}
		
		return min + " " + max;
	}
}
