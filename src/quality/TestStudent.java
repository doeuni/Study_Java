package quality;

class StudentVO { //데이터를 담는 상자
	private String name;//이름을 담는 변수
	
	public void setName(String name) { //이름을넣는메소드
		this.name = name;
	}
	
	public String getName() {//이름을 가져오는 메서드
		return name;
	}
}
class Client {
	Parent p;
	
	Client() {
		p = new Student();
	}
	
	void doService(StudentVO vo) {
		p.doService(vo);
	}
}
interface Parent { 
    void doService(StudentVO vo);
}
class Student implements Parent {
    public void doService(StudentVO vo) {
	    System.out.println(vo.getName());
    }	 
}
class TestStudent {
	public static void main(String[] args) {
	    StudentVO vo = new StudentVO();
	    vo.setName("강감찬");	   
	    Client c = new Client();
	    c.doService(vo); //"홍길동"
	}
}