package level0;

public class Exam8 {
	public static void main(String[] args) {
		Exam8 exam = new Exam8();
		int[] array = {149,180,192,170};
		System.out.println(exam.solution(array, 167));
	}
	public int solution(int[] array, int height) {
		 int cnt = 0;
	     for(int i=0;i<array.length;i++){
			if(array[i]>height){
			        cnt++;
			}
	     }
	        return cnt;
    }
}
