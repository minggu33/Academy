
public class testtest {

	public static void main(String[] args) {
		
		int[] score = {95,70,80,75,100};
		int total = 0;
		double ave = 0;
		
		for(int i = 0; i < score.length; i++) {
			total += score[i];
			
		}
		ave = total/score.length;
		System.out.println("총합 : "+ total + ", 평균 : "+ave);
		

	}

}
