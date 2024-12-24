package cal;

public class TestCal {
	public static void main(String[] args) {
		CalVO vo = new CalVO();
		vo.setA(args[0]);
		vo.setOp(args[1]);
		vo.setB(args[2]);
		
		Cal c = new Cal();
		c.cal(vo);
	}
}
