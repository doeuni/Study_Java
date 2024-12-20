package shirt;

public class DefaultShirt {
	private int shirtID = 0; //멤버필드는 습관적으로 private붙여줌
	private String description = "-description required-";
	private char colorCode = 'U';
	private double price = 0.0;
	private int quantityInStock = 0;
	
	public DefaultShirt() {
		colorCode = 'R';
	}
	
	public char getColorCode() {
		return colorCode;
	}
	
	public void setColorCode(char colorCode) {
		this.colorCode = colorCode;
	}
}
