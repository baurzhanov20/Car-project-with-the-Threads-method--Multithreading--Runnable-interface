import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Car c1 = new Car("BMW", 30, 10);
		// Car c2 = new Car("Mercedes", 25, 15);
		// Car c3 = new Car("Toyota", 15,30);
		
		// c1.ride();
		// c2.ride();
		// c3.ride();

		CarThread c1 = new CarThread("BMW", 30, 10);
		CarThread c2 = new CarThread("Mercedes", 25, 15);
		CarThread c3 = new CarThread("Toyota", 15,30);

		c1.start();
		c2.start();
		c3.start();

	}
}