package p1227;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapStudentEx {
	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<String, Student>();
		
		//3명의 학생 저장
		map.put("홍창윤", new Student(1, "010-1234-1234"));
		map.put("최지원", new Student(1, "010-1234-1234"));
		map.put("김도은", new Student(1, "010-1234-1234"));

		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("검색할이름?");
			String name = scanner.nextLine();
			if(name.equals("exit"))
				break;
			Student student = map.get(name);
			if(student == null)
				System.out.println(name + "은 없는 사람입니다.");
			else 
				System.out.println("id:" + student.getId() + "전화" + student.getTel());
		}
		scanner.close();
	}

}
