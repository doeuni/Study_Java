import shirt.ConstructorShirt1;

public class ConstructorShirt1Test {

	public static void main(String[] args) {
		//생성자호출 값던지는 구조 
		ConstructorShirt1 constShirt = new ConstructorShirt1('R'); //객체생성
		char colorCode;
		
		colorCode = constShirt.getColorCode();
		
		System.out.println("COlor COde:"+ colorCode);
		

	}

}
