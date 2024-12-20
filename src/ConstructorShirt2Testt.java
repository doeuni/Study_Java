/**
 * 
 */

/**
 * 
 */
public class ConstructorShirt2Testt {

	public static void main(String[] args) {	
		ConstructorShirt2Test constShirtFirst = new ConstructorShirt2Test();
		ConstructorShirt2Test constShirtSecond = new ConstructorShirt2Test('G');
		ConstructorShirt2Test constShirtThird = new ConstructorShirt2Test('B',100);

		
		char colorCode;
		int quantity;
		
		colorCode = constShirtFirst.getColorCode();
		System.out.println("Object 1 Color Code: " + colorCode);
		
		colorCode = constShirtSecond.getColorCode();
		System.out.println("Object 2 Color Code: " + colorCode);
		
		colorCode = constShirtThird.getColorCode();
		quantity = constShirtThird.getQuantityInStock();
		
		//생성자 쓰임에 대해서 이해할 수있는부분 초기화라는게 멤버필드의값을 수정하는 방법에는
		//어떤게있냐
	}

}
