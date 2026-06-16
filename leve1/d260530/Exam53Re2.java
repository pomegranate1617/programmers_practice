package leve1.d260530;

public class Exam53Re2 {//2016년
	public static void main(String[] args) {
		System.out.println(solution(5,24));
		System.out.println(solution(1,1));
		System.out.println(solution(12,31));
		System.out.println(solution(3,1));
		System.out.println(solution(1,31));
		System.out.println(solution(1,8));
		System.out.println(solution(1,2));
		System.out.println(solution(2,29));
	}//9,13테스트 케이스 자꾸 깨짐 =>원인 : 목요일 철자 틀림...
	
	public static String solution(int a,int b) {
		
		int[] monthDay= {0,31,29,31,30,31,30,31,31,30,31,30,31};
		String[] weekDay = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		//1월1일부터 경과기간 구하기
		//전달까지의 일수의 합 + 당월 일수의 합

		
		int afterDay = 0;
		int stdWeekDayIdx = 5;//weekDay[5],FRI
		
		for(int i=1;i<a;i++) {
			afterDay += monthDay[i];
		}
		
		//afterDay += b; =>기준일 포함
		//기준일 미포함
		afterDay += (b - 1);
		
		//밖에서 -1하면 인덱스 범위 넘어갈 수도 있음(ex)인덱스가 -1이 됨)
//		int todayIdx = (stdweekDayIdx + afterDay % 7) % 7 - 1;
		
		//todayIdx에서 -1 보정하면 기준일(1월1일)당일의 경우 기준일의 전 요일의 인덱스를 가리키게 됨...
		//근데 답이 왜인지 잘 나옴;; => 기준일을 포함하지 않기위해 b-1로 미리 보정
		// =>답이 잘 나왔던 이유 위에서 b-1이 아닌 b를 함으로써 1월1일 자체도 포함해
		//계산했기 때문이었다..
		
//		int todayIdx = (stdweekDayIdx + afterDay % 7 - 1) % 7;
		//stdWeekDayIdx = 5; afterDay = 0; 
		
		int todayIdx = (stdWeekDayIdx + afterDay % 7) % 7;
		String today = weekDay[todayIdx];
		
		return today;
		
	}

}
