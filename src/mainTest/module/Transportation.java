package mainTest.module;
/*
 * 1. field
 * 이동수단번호
 * 탑승객 수
 * 수익
 * 
 * 2.method
 * 탑승하기 takeAWay()
 * 수익정산하기 exchange(int fee)
 *
 */
public class Transportation {
	//filed
	protected String TranportaionNumber;
	protected int numberOfPassengers;
	protected int benefit;
	protected int fee;
	
	
	//method
	public void takeAWay(int fee) {
		numberOfPassengers++;
		benefit += fee;
	}
	public void printInfo() {
		System.out.println(" 차량번호 "+TranportaionNumber+" 현재 탑승인원 "+numberOfPassengers+" 이며,"+ benefit + "원 수익이 발생하였습니다.");
	
	}
}
