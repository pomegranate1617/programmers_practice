package leve1.d260530;

public class Exam53 {//2016년
	public static void main(String[] args) {
		System.out.println(solution(5,24));
	}
	
	 public static String solution(int a,int b) {
	        
			int[] monthDay= {0,31,29,31,30,31,30,31,31,30,31,30,31};
			String[] weekDay = {"SUN","MON","TUE","WED","THE","FRI","SAT"};
	        
			//1월1일부터 경과기간 구하기
			//전달까지의 일수의 합 + 당월 일수의 합
//			String stdDay = weekDay[5];
			
			int afterDay = 0;
			
			for(int i=1;i<a-1;i++) {
				afterDay += monthDay[i];
			}
			
			afterDay += b;
			

			int todayIdx = (5 + 1+ afterDay % 7) % 7;
			String today = weekDay[todayIdx];
			
			return today;
			
		}
}
