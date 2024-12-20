package P1219;

class Client {
	Service s;
	void doService() {
		s = new ServiceImpl();
		s.doService();
	}
  }
  interface Service {
	void doService();
  }
  class ServiceImpl implements Service {
	public void doService() {
		System.out.println("홍길동");
	}
  }
  class TestClient {
	public static void main(String[] args) {
		Client c = new Client();
		c.doService(); //"홍길동"	
	}
  }