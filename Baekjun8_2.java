package baejun;

import java.util.*;

public class Baekjun8_2 {

	public static void main(String[] args) {

		System.out.println("숫자를 입력하세요 ");
		Scanner scanner = new Scanner(System.in);

		int start =1;
		int gongsik = 0;
		int number = scanner.nextInt();
		
		for(int i = 0; ; i++)
		{
			gongsik = gongsik +(6*i);
			
			if(start + gongsik >= number)
			{
				System.out.println(i+1);
				break;
			}
		}
		
	}
}
