package cal;

class Cal {
	ICal ic;
	Cal() {
		ic = new CalImpl(); //다형성
	}
	
	void cal(CalVO vo) {
		ic.cal(vo);
	}
  }
