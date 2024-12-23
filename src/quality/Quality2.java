class Cal {
	void cal(String[] args) {
		int op1 = Integer.parseInt(args[0]); //"5" -> 5
		String op = args[1]; //"add" -> "add"
		int op2 = Integer.parseInt(args[2]); //"3" -> 3
		
		if(op.eqauls("add")) {
			System.out.println(op1 + op2);		
		} else if(op.eqauls("sub")) {
		        System.out.println(op1 - op2);
		} else if(op.eqauls("mul")) {
		        System.out.println(op1 * op2);
		} else if(op.eqauls("div")) {
		        System.out.println(op1 / op2);
		}
	}
  }
  class TestCal {
	public static void main(String[] args) { //args[0]=5, args[1]=add, args[2]=3
		Cal c = new Cal();
		c.cal(args);
	}
  }
