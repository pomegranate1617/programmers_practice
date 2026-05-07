package level0;

public class Exam33 {//배열의 유사도
	public static void main(String[] args) {
		System.out.println(solution(new String[] {"a","b","c"},new String[] {"com","b","d","p","c"}));
		System.out.println(solution(new String[] {"n","omg"},new String[] {"m","dot"}));
	}
	public static int solution(String[] s1,String[] s2) {
		int equalsCnt = 0;
		
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(s1[i].equals(s2[j])) {
					equalsCnt++;
				}
			}
		}
		
		return equalsCnt;
	}
}
