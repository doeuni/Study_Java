import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("300x300 스윙프레임만들기");
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
	//생성자 호출에 대해 시험에 나옴 new Myframe했는데 인스턴스 생성만 하고 객체사용없는데?
	//클래스정의 객체참조선언. 생성자호출할 때. 주소할당. 객체사용은 아직 안하고있다?

}
