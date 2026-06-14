package leve1.d260523;

public class Exam43 {//숫자 문자열과 영단어
	public static void main(String[] args) {
		System.out.println(solution("one4seveneight"));
		System.out.println(solution("23four5six7"));
		System.out.println(solution("2three45sixseven"));
		System.out.println(solution("123"));
		System.out.println(solution("onetwothree"));
		System.out.println(solution("OneTwoTHREE"));
	}
	
	public static int solution(String s) {
		//문자열을 배열로 쪼갠다.
		//숫자가 나올 때 까지 나온 문자들을 합해 문자열로 나눈다
		//숫자가 나오면 단어를 숫자로 변환해 추가하고 나온 숫자를 추가 후
		//StringBuilder리셋 후 위 과정 반복
		char[] character = s.toLowerCase().toCharArray();
		
		StringBuilder numStr = new StringBuilder();//리턴할 숫자
		
		StringBuilder engNum = new StringBuilder();//분리한 단어
		
		boolean isNumStart = false;
		
		for(int i=0;i<character.length;i++) {
			
			if(character[i] >='0' && character[i] <='9') {
	
				isNumStart = true;
				numStr.append(character[i]);
			}else {
				engNum.append(character[i]);
			}
			
			
			if(engNum.length()>=3) {
				
				String word = engNum.toString();
				
				int transWord = switch(word) {
					case "zero"  -> 0;
					case "one"   -> 1;
					case "two"   -> 2;
					case "three" -> 3;
					case "four"  -> 4;
					case "five"  -> 5;
					case "six"   -> 6;
					case "seven" -> 7;
					case "eight" -> 8;
					case "nine"  -> 9;
					default -> -1;
				};
				
				
				if(transWord != -1) {
					
					numStr.append(transWord);
					
					engNum.replace(0,engNum.length(),"");
				}	
			}
		}
		
		return Integer.parseInt(numStr.toString());
	}
}
