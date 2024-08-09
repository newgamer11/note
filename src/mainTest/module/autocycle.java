package mainTest.module;

public class autocycle extends Transportation {
	int fee = 5000;
	String 	TranportaionNumber = "20사2145";
	@Override
	public void printInfo() {
		System.out.println(" 차량번호 "+TranportaionNumber+" 현재 탑승인원 "+numberOfPassengers+" 이며,"+ benefit + "원 수익이 발생하였습니다.");
	}
	
}
