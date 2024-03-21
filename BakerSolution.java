import java.util.Scanner;

class Bakers {
	private int bakerId;
	private String bakersName;
	private char bakerClass;
	private double bakerRating;
	private boolean onlineDelivery;

	Bakers(int bid, String bname, char bclass, double brating, boolean od) {
		this.bakerId = bid;
		this.bakersName = bname;
		this.bakerClass = bclass;
		this.bakerRating = brating;
		this.onlineDelivery = od;
	}

	int getBakerId() {
		return bakerId;
	}

	void setBakerId(int bakerId) {
		this.bakerId = bakerId;
	}

	String getBakersName() {
		return bakersName;
	}

	void setBakersName(String bakersName) {
		this.bakersName = bakersName;
	}

	double getBakerRating() {
		return bakerRating;
	}

	void setBakerRating(double bakerRating) {
		this.bakerRating = bakerRating;
	}

	char getBakerClass() {
		return bakerClass;
	}

	void setBakerClass(char bakerClass) {
		this.bakerClass = bakerClass;
	}

	boolean getOnlineDelivery() {
		return onlineDelivery;
	}

	void setOnlineDelivery(boolean onlineDelivery) {
		this.onlineDelivery = onlineDelivery;
	}

}

public class BakerSolution {

	public static boolean findDeliveryType(Bakers[] arr, int bid) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getBakerId() == bid) {
				if (arr[i].getOnlineDelivery() == true) {
					System.out.println("Online Available");
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Bakers arr[] = new Bakers[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Input");
		for (int i = 0; i < arr.length; i++) {
			int bid = sc.nextInt();
			sc.nextLine();
			String bname = sc.nextLine();
			char bclass = (char) sc.nextInt();
			double brating = sc.nextInt();
			boolean od = sc.nextBoolean();
			Bakers b = new Bakers(bid, bname, bclass, brating, od);
			arr[i] = b;
		}
		boolean ba;
		ba = findDeliveryType(arr, 12934);
		if (ba == true) {
			System.out.println(ba);
		} else {
			System.out.println("Online Not Available");
		}
	}
}