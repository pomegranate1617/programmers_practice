//package leve1.d260526;
//
//import java.util.Arrays;
//
//public class Exam46Re3 {
//	public static void main(String[] args) {
//		
//	}
//	
//	public static String[] solution(String strings,int n) {
//		String[] newArr = Arrays.asList(strings)
//								  .stream()
//								  .sorted((a,b)->{
//									  if(a.substring(n)<b.substring(n)) return -1;
//									  else if(a.substring(n).equals(b.substring(n)) return 0;
//									  else return 1;
//								  })
//								  .toArray();
//	}
//}
