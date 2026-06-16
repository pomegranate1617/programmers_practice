package leve1.d260604;

public class Exam57 {//옹알이(2)
	public static void main(String[] args) {
		String[] arr = {"aya","yee","u","maa"};
		System.out.println(solution(arr));
		System.out.println("=============================");
		String[] arr2 = {"ayaye","uuu","yeye","yemawoo","ayaayaa"};
		System.out.println(solution(arr2));
	}
	public static int solution(String[] babbling) {
		//연속해서 같은 발음 불가
		//앞 인덱스부터 차례대로 읽고 분리
		//이미 지나간 인덱스의 경우 비교 불가
		String[] pronunciation = {"aya","ye","woo","ma"};
		
		int possibleCnt = 0;
		
		for(String word : babbling) {
			
			String[] character = word.split("");
			
			StringBuilder sb = new StringBuilder(word);
			
			int prevPronunIdx = -1;
			boolean isBreak = false;
			
			for(int i=0;i<character.length;i++) {
				sb.append(character[i]);
				
				for(int j=0;j<pronunciation.length;j++) {
					//StringBuilder자체로 String타입 데이터와 비교하면 안됨.
					if(sb.equals(pronunciation[j])) {
						
						if(sb.equals(pronunciation[prevPronunIdx])){
							isBreak = true;
							break;
						}else {
							sb.replace(0, sb.length(), "");
							prevPronunIdx = j;
						}	
					}
				}	
			}
			if(!isBreak) {
				possibleCnt++;
			}
		}
		
		return possibleCnt;
	}

}
