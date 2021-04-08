
public class test40 {

	public static void main(String[] args) {
		
		// 배열 연습2
		
		// 5명의 학생의 점수를 저장시킬 배열 생성한 후 총합, 평균 구하기
		// 4바이트 크기의 정수 데이터들을 저장시킬 배열 생성 한후
		// 배열메모리의 주소를 담을 score변수 만들기
		// 단, 배열에 저장시킬값 95, 70, 80, 75, 100
		
		// 점수의 총합을 저장시킬 total 이름의 변수 만들기. 0 저장
		
		// 평균을 구하여 8바이트 크기의 실수값을 저장할 ave변수 만들기
		
		// for반복문을 이용하여 5명 학생의 점수들을 반복해서 total 변수에 누적(총합구하기)
		
		
		
		int[] score = {95, 70, 80, 75, 100};
		int total = 0;
		double ave = 0;
		
		for(int i = 0; i < score.length; i++) {
			total += score[i];
		}
		
		ave = total/5;
		
		System.out.println("총합출력 Total = "+total);
		System.out.println("평균출력 ave = "+ave);

		System.out.println("------------------------------");
		
		
	// 예제. 5개의 실수값 중에서 최대값 구하기
		
			// 8바이트 크기의 실수값들 9.5, 7.0, 13.6, 7.5, 1.0
			// 생성한 배열 메모리의 주소값을 data변수에 저장
		
			// 5개의 숫자중 최대값을 저장시킬 8바이트 크기의 실수값을 저장할 변수 만들기(변수 max)
			
			// max 변수에 data배열의 0번째 인덱스 위치에 있는 데이터를 꺼내어 최대값으로 저장
			// for문을 이용하여 
			// data 배열의 1인덱스 위치의 값부터 4인덱스 위치의 값을 반복해서 꺼내어서
			// max 변수에 저장된 값과 비교합니다.
				// 	if문을 이용하여
				//  data배열의 인덱스 위치에 저장된 값이 max변수에 저장된 값보다 크다면
				//  그 값을 최대값으로 설정하기 위해서 max변수에 다시 저장
		
		double max = 0;
		
		double[] data = {9.5, 7.0, 13.6, 7.5, 1.0};
		
		max = data[0];
		
		for(int i = 1; i < data.length; i++) {
			if(data[i]>max) {
				max = data[i];
			}
		}
			
		System.out.println("max = "+ max);
		
		
		
		
		
	}

}
