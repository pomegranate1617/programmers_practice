package leve1.d260530;

public class Exam53Re {//2016년
	public static void main(String[] args) {
		System.out.println(solution(5,24));
		System.out.println(solution(1,1));
		System.out.println(solution(12,31));
		System.out.println(solution(3,1));
		System.out.println(solution(1,31));
		System.out.println(solution(1,8));
		System.out.println(solution(1,2));
	}
	
	public static String solution(int a,int b) {
		
		int[] monthDay= {0,31,29,31,30,31,30,31,31,30,31,30,31};
		String[] weekDay = {"SUN","MON","TUE","WED","THE","FRI","SAT"};
		
		//1월1일부터 경과기간 구하기
		//전달까지의 일수의 합 + 당월 일수의 합

		
		int afterDay = 0;
		int stdweekDayIdx = 5;//weekDay[5],FRI
		
		for(int i=1;i<a;i++) {
			afterDay += monthDay[i];
		}
		
		afterDay += b;
		//밖에서 -1하면 인덱스 범위 넘어갈 수도 있음
//		int todayIdx = (stdweekDayIdx + afterDay % 7) % 7 - 1;
		int todayIdx = (stdweekDayIdx + afterDay % 7 - 1) % 7;
		//stdseekDayIdx = 5; afterDay = 1; 
		String today = weekDay[todayIdx];
		
		return today;
		
	}

}
