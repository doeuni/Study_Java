package Practice2_14;

import java.util.Scanner;

public class GradingSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력하세요:");
		int score = scanner.nextInt();
		switch (score/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break ;
		case 7 : 
			
		}
	}

}
