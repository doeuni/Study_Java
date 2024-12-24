package cal;

public class CalImpl implements ICal {

	@Override
	public void cal(CalVO vo) {
		int op1 = Integer.parseInt(vo.getA());
		int op2 = Integer.parseInt(vo.getB());
		String op = vo.getOp();
		
		if(op.equals("add")) {
			System.out.println(op1 + op2);		
		} else if(op.equals("sub")) {
		        System.out.println(op1 - op2);
		} else if(op.equals("mul")) {
		        System.out.println(op1 * op2);
		} else if(op.equals("div")) {
		        System.out.println(op1 / op2);
		}
	}

}
