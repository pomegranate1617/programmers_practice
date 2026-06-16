package leve1.d260615;

import java.util.Arrays;

public class Exam46Re4 {//문자열 내 마음대로 정렬하기
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
	}
	
	public static String[] solution(String[] strings,int n) {
		//문자열의 n인덱스위치 기준으로 오름차순 정렬
		//해당 인덱스의 문자가 같은 경우 사전순(오름차순)으로 정렬
		
		//해당 인덱스의  문자를 charAt()를 이용하여 꺼낸 뒤 뒷원소들의 문자들과 비교
		//같을 경우 맨 앞문자부터 사전순으로 비교 후 앞,뒤로 정렬
		String[] sortStrings = Arrays.copyOf(strings, strings.length);
		
		for(int i = 0; i < sortStrings.length; i++) {
			
			char character = sortStrings[i].charAt(n);
			
			for(int j = i + 1; j < sortStrings.length; j++) {
				
				char compareChar = sortStrings[j].charAt(n);
				
				//char은 equals로 비교 불가
				if(character > compareChar) {
					//문자가 다를 경우(큰 경우) => 정렬 변경
					String temp = sortStrings[i];
					sortStrings[i] = sortStrings[j];
					sortStrings[j] = temp;
				}else if(character < compareChar) {
					//문자가 다를 경우(작은 경우) => 정렬 변경 x
					continue;
				}else {
					//문자가 같을 경우
					int sortNum1 = sortStrings[i].compareTo(sortStrings[j]);
					//음수,0,양수일경우
					if(sortNum1 < 0) {
						continue;
					}else if(sortNum1 > 0) {
						
						String temp2 = sortStrings[i];
						sortStrings[i]  = sortStrings[j];
						sortStrings[j] = temp2;
					}else {
						
						String compareString = sortStrings[j];
						
						for(int k = j; k <= i + 1; k--) {
							
							if(k != i + 1) {
								sortStrings[k] = sortStrings[k - 1];
							}else {
								sortStrings[k] = compareString;
							}
						}
					}
					
				}
			}
		}
		
		return sortStrings;
	}
}
