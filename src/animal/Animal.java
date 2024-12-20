package animal;

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) { //일반생성자
		this.legs = legs; //초기화.. this.뭐 하면 이 클래스의 legs를 의미함. 
	}
	
	
	public void walk() {
		System.out.println("This animal Walkon " + legs +"legs.");
	}
	
	public abstract void eat();
}
