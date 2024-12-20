package animal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//spider
		Spider spider = new Spider();
		spider.walk();
		spider.eat();
		
		//Cat
		Cat cat = new Cat("A");
		cat.walk();
		cat.play();
		cat.eat();


		//FIsh
		Fish fish = new Fish();
		fish.setName("B");
		fish.walk();
		fish.play();
		fish.eat();
	}

}
