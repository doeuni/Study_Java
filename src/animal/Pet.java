package animal;

public interface Pet {
	public String getName();//인터페이스는 뒤에 {} 넣어서 구현하지않음. 구현은 밑에서애들일할거
	//인터페이스 나라는 무조건 다 public이라 뺴도 되고 넣어도됨
	
	public void setName(String n); //이거name아니고 n?으로해댇
	
	public void play();

}
