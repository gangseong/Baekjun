package baejun;

public class Baekjun81 {

	public static void main(String[] args) {
		int A = 1000;
		int B = 70;
		int C = 140;
		int result = 0;
		int sum = 0;
		
		System.out.println("���ͺб����� ?");
		
		for(int i=1; i<100; i++) {
			sum = A + (B * i);
			result = C * i;
			
			if(result>=sum) {
				System.out.printf("���ͺб����� = %d",i);
				break;
			}
		}
	}

}
