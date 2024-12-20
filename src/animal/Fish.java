package animal;

public class Fish extends Animal implements Pet {
	private String name;
	
	public Fish() {
		super(0);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String n) {
		// TODO Auto-generated method stub
		this.name = n;
	}

	@Override
	public void play() {
		System.out.println("fish play");
	}

	@Override
	public void eat() {
		System.out.println("fish eat");

	}

}
