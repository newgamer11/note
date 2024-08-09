package Main;

import java.util.Scanner;

import mainTest.module.Car;
import mainTest.module.Passenger;
import mainTest.module.Transportation;
import mainTest.module.autocycle;


public class Main {

	public static void main(String[] args) {
		Passenger user = new Passenger("지나가는 사람",50000);
		Transportation car = new Car();
		Transportation cycle = new autocycle();
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("어떤 수단을 탑승하실건가요? : 자동차, 오토바이 ");
		String Transportaion_Way = scan.nextLine();
		
		System.out.println("몇분 탑승하실건가요? : (명) ");
		int num = Integer.parseInt(scan.nextLine());
		if (Transportaion_Way.equalsIgnoreCase("자동차")) {
			user.take(car,num);			
		} else if(Transportaion_Way.equalsIgnoreCase("오토바이")) {
			user.take(cycle,num);	
		}
		user.printInfo();
//		car.printInfo();
//		cycle.printInfo();
		
		System.out.println("다시 탑승하실건가요?: y/n");
		String isexit = scan.nextLine();
		if(isexit.equals("n")) {
			break;
		}
		
		} while(true);
	}
}
