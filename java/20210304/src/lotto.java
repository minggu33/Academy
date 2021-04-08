import java.util.Scanner;

public class lotto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 개의 세트를 추출하시겠습니까?\n>>");
		int set = sc.nextInt();
		int cnt = 1;
		
		while(set>0) {
			
			int[] nums = new int[6];
			for(int i = 0; i < nums.length; i++) {
				int temp = (int)(Math.random()*45)+1;
				nums[i]=temp;
				
				for(int j =0; j < i ; j++) {
					if(nums[j]==temp) {
					i--;
					break;
			}
		}
				
	}
		System.out.println("\n"+cnt+"번째 :");
		for(int i = 0; i < nums.length;i++) {
			System.out.println(nums[i] + "");
		}
		set--;
		cnt++;
	}
}
}


