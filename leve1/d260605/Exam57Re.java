package leve1.d260605;

public class Exam57Re {//옹알이(2)//다른 사람 코드 String의 startWith()함수보기
	public static void main(String[] args) {
		String[] arr = {"aya","yee","u","maa"};
		System.out.println(solution(arr));
		System.out.println("=============================");
		
		String[] arr2 = {"ayaye","uuu","yeye","yemawoo","ayaayaa"};
		System.out.println(solution(arr2));
		System.out.println("==============================");
		
		String[] arr3 = {"ayaaya","yeye","wooma","ayaaye","yye","woooaya"};
		System.out.println(solution(arr3));
		System.out.println("======================");
	}
	
	public static int solution(String[] babbling) {
		
		String[] pronun = {"aya","ye","woo","ma"};
		int possibleCnt = 0;
		
		for(int i=0;i<babbling.length;i++) {
			
			String[] character = babbling[i].split("");
			
			StringBuilder sb = new StringBuilder();
			
			boolean isBreak = false;
			int prevPronunIdx = -1;
			
			for(int j=0;j<character.length;j++) {
				
				sb.append(character[j]);
				
				if(sb.length()>=2 && sb.length()<=3) {
					
					for(int k=0;k<pronun.length;k++) {
						
						String word = sb.toString();
						
						if(word.equals(pronun[k]) && k != prevPronunIdx) {
							prevPronunIdx = k;
							sb.delete(0, sb.length());
							break;
						}
					}
				}else if(sb.length()>3){
					isBreak = true;
					break;
				}
			}
			//sb안에 길이가 3이하인 발음목록안에 없는 문자열이 남아있을 수 있음
			//sb.isEmpty()
			if(!isBreak && sb.isEmpty()) {
				possibleCnt++;
			}
		}
		
		return possibleCnt;
	}

}
