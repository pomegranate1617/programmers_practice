package leve1.d260528;

import java.util.Arrays;

public class Exam49 {//추억 점수
	public static void main(String[] args) {
		String[] name = {"may","kein","kain","radi"};
		int[] yearning = {5,10,1,3};
		String[][] photo = {
				{"may","kein","kain","radi"},
				{"may","kein","brin","deny"},
				{"kon","kain","may","coni"}
		};
		int[] answer1 = solution(name,yearning,photo);
		System.out.println(Arrays.toString(answer1));
		
		System.out.println("==========================");
		
		
		String[] name2 = {"kali","mari","don"};
		int[] yearning2 = {11,1,55};
		String[][] photo2 = {
				{"kali","mari","don"},
				{"pony","tom","teddy"},
				{"con","mona","don"}
		};
		int[] answer2 = solution(name2,yearning2,photo2);
		System.out.println(Arrays.toString(answer2));
		
		System.out.println("==========================");
		
		
		String[] name3 = {"may", "kein", "kain", "radi"};
		int[] yearning3 = {5, 10, 1, 3};
		String[][] photo3 = {
				{"may"},
				{"kein", "deny", "may"},
				{"kon", "coni"}
		};
		int[] answer3 = solution(name3,yearning3,photo3);
		System.out.println(Arrays.toString(answer3));
		
		System.out.println("==========================");
		
		
	}
	
	public static int[] solution(String[] name,int[] yearning,String[][] photo) {
		//yearning이나 name에 사진속 인물의 이름이 없을 수도 있다.
		//name에 이름이 있을경우만 yearning에서 점수 찾기
		
		int[] scoreArr = new int[photo.length];
		
		for(int i=0;i<photo.length;i++) {
			
			int score = 0;
			
			for(int j=0;j<photo[i].length;j++) {
				
				String friend = photo[i][j];
				int existIdx = -1;
				
				for(int k=0;k<name.length;k++) {
					
					if(name[k].equals(friend)) {
						existIdx = k;
						break;
					}
				}
				
				if(existIdx != -1) {
					score += yearning[existIdx];
				}
			}
			scoreArr[i] = score;
		}
		
		return scoreArr;
	}
}
