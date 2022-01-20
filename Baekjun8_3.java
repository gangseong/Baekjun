package baejun;

public class Baekjun8_3 {

	public static void main(String[] args) {
		int start =1;
		int gijun = 1;
		int count = 1;
		
		int num = 7;
		
		for(int i =1; i<5 ; i++) {
			System.out.println(i+"/"+gijun);
			for(int j=i; j>1; j--) {
				gijun++;
				System.out.println(j-1+"/"+gijun);
			}
			gijun=1;
		}

	}

}
