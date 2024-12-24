package p1223;


class CalImpl implements ICal {
	public void cal(String[] args) {
		int op1 = Integer.parseInt(args[0]); //"5" -> 5
		String op = args[1]; //"add" -> "add"
		int op2 = Integer.parseInt(args[2]); //"3" -> 3
		
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
class TestCal {
	public static void main(String[] args) { //args[0]=5, args[1]=add, args[2]=3
		ICal ic = new CalImpl();
		ic.cal(args);
	}
}

