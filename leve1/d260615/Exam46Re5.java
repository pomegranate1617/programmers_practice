package leve1.d260615;

import java.util.Arrays;

public class Exam46Re5 {//문자열 내 마음대로 정렬하기
	public static void main(String[] args) {
		
		String[] strings1 = {"sun","bed","car"};
		int n = 1;
		String[] arr1 = solution(strings1,n);
		System.out.println(Arrays.toString(arr1));
		System.out.println("-----------------------");
		
		String[] strings2 = {"abce","abcd","cdx"};
		int n2 = 2;
		String[] arr2 = solution(strings2,n2);
		System.out.println(Arrays.toString(arr2));
		System.out.println("-----------------------");
	
		String[] strings3 = {"ab","cd","ab","fg"};
		int n3 = 1;
		String[] arr3 = solution(strings3,n3);
		System.out.println(Arrays.toString(arr3));
		System.out.println("---------------------------");
		
		String[] strings4 = {"abd","cd","abc","fg","cbd"};
		int n4 = 1;
		String[] arr4 = solution(strings4,n4);
		System.out.println(Arrays.toString(arr4));
		System.out.println("---------------------------");
	}
	
	public static String[] solution(String[] strings, int n) {
		//문자열의 n인덱스위치 기준으로 오름차순 정렬
		//해당 인덱스의 문자가 같은 경우 사전순(오름차순)으로 정렬
		
		//해당 인덱스의  문자를 charAt()를 이용하여 꺼낸 뒤 뒷원소들의 문자들과 비교
		//같을 경우 맨 앞문자부터 사전순으로 비교 후 앞,뒤로 정렬
		
		String[] sortStrs = Arrays.copyOf(strings, strings.length);
		
		for(int i = 0; i < sortStrs.length; i++) {
			
			char strsChar = sortStrs[i].charAt(n);
			
			for(int j = i + 1; j < sortStrs.length; j++) {
				
				char nextStrChar = sortStrs[j].charAt(n);
				
				if(strsChar > nextStrChar) {
					
					String temp = sortStrs[i];
					sortStrs[i] = sortStrs[j];
					sortStrs[j] = temp;
				}else if(strsChar == nextStrChar){
					
					int sortNum = sortStrs[i].compareTo(sortStrs[j]);
					
					if(sortNum >= 0) {
						
						String temp2 = sortStrs[i];
						sortStrs[i] = sortStrs[j];
						sortStrs[j] = temp2;
					}else {
						continue;
					}
				}else {
					continue;
				}
			}
		}
		
		return sortStrs;
	}
}
