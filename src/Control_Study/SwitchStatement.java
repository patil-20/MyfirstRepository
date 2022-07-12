package Control_Study;

public class SwitchStatement {

	public static void main(String[] args) {
	
		//year 1--> welcome to the 1st year engg
		//year 2--> welcome to the 2st year engg
		//year 3--> welcome to the 3st year engg
		//year 4--> welcome to the 4st year engg
		//year default--> please enter year between 1-4
		
		int Year=25;
		switch (Year) {
		case 1:System.out.println(" welcome to the 1st year engg");
			break;
		case 2:System.out.println("welcome to the 2st year engg");
		    break;
		case 3:System.out.println("welcome to the 3st year engg");
		    break;
		case 4:System.out.println(" welcome to the 4st year engg");
		    break;

		default:System.out.println("please enter year between 1-4");
			break;
		}

	}

}
