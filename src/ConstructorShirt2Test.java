
public class ConstructorShirt2Test {
	private int shirtID = 0; //멤버필드는 습관적으로 private 붙여줌
	private String description = "-description required-";
	private char colorCode = 'U';
	private double price = 0.0;
	private int quantityInStock = 0;
	
	public ConstructorShirt2Test() {
		colorCode = 'R';
	}
	
	public ConstructorShirt2Test(char startingCode) {
		switch (startingCode) {
		case 'R' : 
		case 'G' :
		case 'B':
			colorCode = startingCode;
			break;
			default : 
				System.out.println("Invalid colorCode. Use R, G, or B");
			
		}
	}
	public ConstructorShirt2Test(char startingCode, int startingQuantity) {
		switch (startingCode) {
		case 'R' :
			colorCode = startingCode;
			break;
		case 'G' :
			colorCode = startingCode;
			break;
		case 'B' :
			colorCode = startingCode;
			break;
		default :
			System.out.println("Invalid colorCode. USE rgb");
			
		}
		if (startingQuantity > 0 && startingQuantity < 2000) {
			quantityInStock = startingQuantity;
			
		} else {
			System.out.println("Invalid quantity. Must be > 0 and < 2000");
		}
	}
	
	public char getColorCode() {
		return colorCode;
	}
	
	public int getQuantityInStock() {
		return quantityInStock;
	}
}
