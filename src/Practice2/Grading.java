package Practice2;

import java.util.Scanner;

public class Grading {
	public void grade() { //멤버함수(메소드)
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 :");
		int score = scanner.nextInt();
		if(score >= 90)
			grade = 'A';
			else if (score >= 80)
				grade = 'B';
				else if (score >= 70)
					grade = 'C';
				else 
					grade = 'F';
		System.out.println("학점은 "+ grade+ "입니다.");
		
		scanner.close()	;
		}

}
