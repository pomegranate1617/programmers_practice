package leve1.d260521;

public class Exam38 {//가장 가까운 같은 글자
	public static void main(String[] args) {
		
		int[] arr = solution("a");
		for(int num : arr) {
			System.out.println(num);
		}
		System.out.println("==================");
		
		
		int[] arr2 = solution("banana");
		for(int num : arr2) {
			System.out.println(num);
		}
		System.out.println("==================");
		
		
		int[] arr3 = solution("foobar");
		for(int num : arr3) {
			System.out.println(num);
		}
		System.out.println("====================");
		
		int[] arr4 = solution("aaaaaaaaaaaa");
		for(int num : arr4) {
			System.out.println(num);
		}
		System.out.println("===================");
		
		
		int[] arr5 = solution("abcde");
		for(int num : arr5) {
			System.out.println(num);
		}
	}
	
	public static int[] solution(String s) {
		
		String[] character = s.split("");
		
		int[] location = new int[s.length()];
		
		
		
		for(int i=0;i<character.length;i++) {
			
			int idx = -1;
			
			for(int j=0;j<i;j++) {
				
				if(character[j].equals(character[i])) {
					idx = j;
				}
			}
			
			
			if(idx == -1) {
				location[i] = idx;
			}else {
				location[i] = i - idx;
			}
		}
		
		return location;
	}
}
