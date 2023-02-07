public class CarThread extends Thread{

	int speed;
	String name;
	int seconds;

	public CarThread(String name, int speed, int seconds){
		this.name = name;
		this.speed = speed;
		this.seconds = seconds;
	}

	public void run(){
		
		int distance = 0;

		for(int i=0;i<=seconds;i++){
			System.out.println("Car "+name+" with speed "+speed+" m/s at "+distance + " meters in "+i+" seconds");
			distance = distance+speed;
			try{

				Thread.sleep(500);

			}catch (Exception e) {
				
			}
		}
	
	}

}