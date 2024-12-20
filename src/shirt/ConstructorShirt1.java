package shirt;

public class ConstructorShirt1 {
	private int shirtID = 0; //멤버필드는 습관적으로 private 붙여줌
	private String description = "-description required-";
	private char colorCode = 'U';
	private double price = 0.0;
	private int quantityInStock = 0;
	
	public ConstructorShirt1(char startingCode) {
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
	
	public char getColorCode() {
		return colorCode;
		
	}
	
}
