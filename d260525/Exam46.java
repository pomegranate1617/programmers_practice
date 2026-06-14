package leve1.d260525;

import java.util.Arrays;

public class Exam46 {//문자열 내 마음대로 정렬하기
	public static void main(String[] args) {
		String[] arr = solution(new String[] {"sun","bed","car"},1);
		System.out.println(Arrays.toString(arr));
		System.out.println("==============================");
		
		String[] arr2 = solution(new String[] {"abce","abcd","cdx"},2);
		System.out.println(Arrays.toString(arr2));
		System.out.println("===============================");
		
		String[] arr3 = solution(new String[] {"ab","abcf","abcd"},1);
		System.out.println(Arrays.toString(arr3));
		System.out.println("================================");
		
		String[] arr4 = solution(new String[] {"abcd","bbcd","abcd"},1);
		System.out.println(Arrays.toString(arr4));
		System.out.println("===============================");
	}
	
	public static String[] solution(String[] strings,int n) {
		//인덱스 n부터 끝까지 잘라서 사전순으로 나열
		String[] newArr = Arrays.copyOfRange(strings,0,strings.length);
		
		for(int i=0;i<newArr.length;i++) {
			
			String word1 = newArr[i].substring(n);
			
			for(int j=i+1;j<newArr.length;j++) {
				
				String word2 = newArr[j].substring(n);
				
				int compare = word1.compareTo(word2);
				
				if(compare>0) {
					
					String temp = newArr[i];
					newArr[i] = newArr[j];
					newArr[j] = temp;
				}
				else if(compare == 0) {
					
					int equalCompare = newArr[i].compareTo(newArr[j]);
					
					if(equalCompare > 0) {
						
						String temp2 = newArr[i];
						newArr[i] = newArr[j];
						newArr[j] = temp2;
					}
				}
			}
			
		}
		
		return newArr;
		
	}

}
