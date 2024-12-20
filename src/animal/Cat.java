package animal;

public class Cat extends Animal implements Pet { 
	private String name ;
	
	public Cat (String n) {
		super(4);
		this.name = n;//사실 여기는this 붙일 필요없음. 이름다르니깐 
	};
	
	public Cat () { //this(""); 기본생성자를 부르면 , .....음?ㅋ ""의 의미는 null 임. 그냥 null하면 객체참조변수의기본값이 다 null
		//인데 string만있는게 아님. null은 주소를 안가지고있다는 말. 
		//객체참조변수 = null ; // 주소가 없다.는 의미 
		//this(null)은 null string이아니라 그냥 null임. 
		super(4);
	};
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String n) {
		this.name = n;
	}

	@Override
	public void play() {
		
		System.out.println("cat play");

	}

	@Override
	public void eat() {
		System.out.println("cat eat");


	}

}
