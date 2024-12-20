package p12192;

class Client {
	Service s;
	void doService() {
		s = new ServiceImpl();
		s.doService();
	}
  }

