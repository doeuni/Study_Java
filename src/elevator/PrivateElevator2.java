package elevator;

public class PrivateElevator2 {
	public boolean doorOpen = false;
	public int currentFloor = 1;
	private int weight = 0; 
	
	private final int CAPACITY = 1000;
	private final int TOP_FLOOR = 5;
	private final int BOTTOM_FLOOR = 1;
	
	public void openDoor() {
		doorOpen = true;
	}
	
	public void closeDoor() {
		calculateCapacity(); //callermethod
		if (weight <= CAPACITY) {
			doorOpen = false;
			
		} else {
			System.out.println("The elevator has exceeded capacity");
			System.out.println("Doors will remain opend until someone exits")
		}
	}

	private void calculateCapacity() {
		weight = (int)(Math.random()* 1500);//method인데 왜 private일까.이건 현재 엘리베이터 클래스안에만 사용될거니까. 
		System.out.println("The weight is " + weight);
	}
	
	public void goUp() {
		if (!doorOpen) { //문이 닫혀진 상태라면
			if (currentFloor < TOP_FLOOR) {
				currentFloor++;
				System.out.println(currentFloor);
				
			} else {
				System.out.println("Already on top");
			}
		} else { //문이 열려진 상태라면
			System.out.println("Doors still open");
		}
	}
	
	public void goDown() {
		if (!doorOpen) {
			if (currentFloor> BOTTOM_FLOOR) {
				currentFloor--;
				System.out.println(currentFloor);
			} else {
				System.out.println("Already");
			}
		} else {
			System.out.println("Doors still open");

		}
	}
	public void setFloor(int desiredFloor) {
		if ((desiredFloor >= BOTTOM_FLOOR)&& (desiredFloor <= TOP_FLOOR)) {
			while (currentFloor != desiredFloor) {
				if (currentFloor < desiredFloor) {
					goUp();
				} else {
					goDown();
				}
			}
		} else {
			System.out.println("Invalid Floor");
		}
	}
	
	public int getFloor() {
		return currentFloor;
	}
	
	public boolean getDoorStatus() {
		return doorOpen;
	}

}

