package mainTest.module;


public class Passenger {
	//field
	private String name;
	private int money;
	//method
	public void take(Transportation Transport, int num) {
		if (Transport instanceof Car) {
			Car carInstance = (Car) Transport;
			for(int i=0; i<num; i++) {
				carInstance.takeAWay(carInstance.fee);
				money = money - carInstance.fee;
		}
			System.out.println(" 차량번호 "+carInstance.TranportaionNumber+" 현재 탑승인원 "+carInstance.numberOfPassengers+" 이며,"+ carInstance.benefit + "원 수익이 발생하였습니다.");
		}
		
		if (Transport instanceof autocycle) {
			autocycle cycleInstance = (autocycle) Transport;
			for(int i=0; i<num; i++) {
				cycleInstance.takeAWay(cycleInstance.fee);
				money = money - cycleInstance.fee;
		}
			System.out.println(" 차량번호 "+cycleInstance.TranportaionNumber+" 현재 탑승인원 "+cycleInstance.numberOfPassengers+" 이며,"+ cycleInstance.benefit + "원 수익이 발생하였습니다.");
		}	
	}
	
	
	public void printInfo() {
		System.out.println(name + "의 현재 남은 잔액은" + money + "입니다");
	}
	//생성자
	public Passenger(String name, int money){
		this.name = name;
		this.money = money;
	}
	
}
