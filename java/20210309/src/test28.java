
// if문  -> switch문으로 바꾸기


public class test28 {

	public static void main(String[] args) {
		
/*		int score = 45; // 점수
		
		char grade = '\u0000';
		
		//score변수에 저장된 점수가 90점 이상이라면 A학점
		if(score >= 90) {
			grade = 'A';
			//score변수에 저장된 점수가 80점 이상이라면 B학점
		}else if(score >= 80) {
			grade = 'B';
			//score변수에 저장된 점수가 80점 미만이라면 c학점
		}else {
			grade = 'C';
		}
		
		
		System.out.println("당신의 학점은 "+ grade + "입니다.");
		
		*/
		
		int score = 88; // 점수
		
		char grade = '\u0000';
		
		score/=10;
		
		switch(score) {
		case 10:
			grade = 'A';
			
		case 9:
			grade = 'A';
			System.out.println("당신의 학점은 "+ grade +" 입니다.");
			break;
		case 8:
			grade = 'B';
			System.out.println("당신의 학점은 "+ grade +" 입니다.");
			break;
		default:
			grade = 'C';
			System.out.println("당신의 학점은 "+ grade +" 입니다.");
			break;
		}
		
		
		

	}

}
