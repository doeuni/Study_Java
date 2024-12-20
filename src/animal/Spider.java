package animal;

public class Spider extends Animal {
	public Spider() {
		super(8); //super(매개변수) 는 부모의 일반생성자호출. 매겨변수없이 하면 기본생성자호출.
	}
	
	
	@Override 
	//이거 떄문에 eat 오타 나면 에러남. 오버라이드니까 부모가갖고있는 그 메소드와연결돼있음. 
	public void eat() { //안에 내용 안채워도 됨. 
		// TODO Auto-generated method stub
		System.out.println("Spider eats insects");
	}

}
