package leve1.d260612;

public class Exam63Re {//둘만의 암호
	public static void main(String[] args) {
		System.out.println(solution("aukks","wbqd",5));
		System.out.println(solution("z","a",1));
		System.out.println(solution("abc","bcd",1));
	}
	public static String solution(String s, String skip, int index) {
		
		//charAt로 s문자열에서 문자 분리
		//skip에 해당 문자가 있는지 contains로 확인
		//있으면 해당 글자 뛰어넘기
		char[] character = s.toCharArray();
		StringBuilder sb = new StringBuilder(s);
		
	
		//최종 문자가 skip에 포함되었을 때가 아니라 항상 skip에 포함되어있는
		//글자는 뛰어넘게 만들어야 함
		
		//글자의 이동을 1씩 반복 > 도중 skip에 포함된 문자가 있으면 한 칸 더 이동
		//1씩 이동 반복 중 'a'~'z'범위를 넘기면 'a'부터 다시 시작
		//글자 이동시 마다 범위 체크해서 교정 후 skip포함 문자인지 확인
		//index만큼 글자 이동이 완료되면 다음 글자로 이동 후 반복
		int characterIdx = 0;
		while(characterIdx <= index) {
			
		}
			
	}
}
