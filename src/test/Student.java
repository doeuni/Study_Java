package test;

public class Student { //헬퍼 클래스
	private String name; //멤버필드.한개의 멤버필드에 대해서 setter,getter 2개가 존재함.
	private int age; //멤버필드 추가. 습관적으로 private붙이자. 외부에서는 볼 수 없게.
	private float height; //private붙여주는이유 : 
	
	String address;
	void setName(String name) { //멤버 메소드
		this.name = name;
	}
	
	String getName() {
			return name;
	}
	
	void setAge(int age) {
		this.age = age;//set으로 시작하는건 setter메소드, get은 getter메소드
	}
	//setter니까 리턴안할거니까 void
	
	int getAge() {
		return age;
	}
	void setAddress(String address) {
		this.address = address;
	}
	String getAddress() {
		return address;
	}

	float getHeight() {
		return height;
	}

	void setHeight(float height) {
		this.height = height;
	}
}
