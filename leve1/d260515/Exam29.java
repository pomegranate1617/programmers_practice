package leve1.d260515;

import java.util.Scanner;

public class Exam29 {//직사각형 별찍기
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		
		int n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		
		solution(n,m);
		
		sc.close();
	}
	
	public static void solution(int n,int m) {
		//m행,n열
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
