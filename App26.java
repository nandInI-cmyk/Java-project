class Bike {
	int speedLimit = 60;

	public void run() {
		System.out.println("Running with 60km");
	}

	public void stop() {
		System.out.println("stopping!");
	}

	public int SpeedLimit() {
		return speedLimit;
	}
}

class Honda extends Bike {
	int speedLimit = 90;

	@Override // annotation
	public void run() {
		System.out.println("Running with 90km");
	}

	public int SpeedLimit() {
		return speedLimit;
	}
}

class Yamaha extends Bike {
	int speedLimit = 120;

	public void run() {
		System.out.println("Running with 120km");
	}

	public int SpeedLimit() {
		return speedLimit;
	}

}

public class App26 {

	public static void main(String[] args) {
		Bike b1 = new Honda();// upcasting
		b1.run();
		b1.stop();
		System.out.println(b1.SpeedLimit());// 90
		System.out.println(b1.speedLimit);// 60
		Bike b2 = new Yamaha();//
		b2.run();
		b2.stop();
		System.out.println(b2.SpeedLimit());// 120
		System.out.println(b2.speedLimit);// 60
	}

}

