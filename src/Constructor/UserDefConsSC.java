package Constructor;

public class UserDefConsSC {
	int speed;
	int time;  //variable declaration
	
	public UserDefConsSC() {
		speed= 40;
		time= 10; //variable initilization
	}
		
	
	 public void distance()
	
	 {	int disValue = speed*time;
		
		System.out.println("the answer is " +disValue);
	}

	public static void main(String[] args) {
		

		UserDefConsSC o1= new UserDefConsSC();
		o1.distance();
		
		}}


