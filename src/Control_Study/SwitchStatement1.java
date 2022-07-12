package Control_Study;

public class SwitchStatement1 {

	public static void main(String[] args) {
		
		//PNQ-->welcome to Pune Airport
		//BOM-->welcome to Mumbai Airport
		//NGP-->welcome to Nagour Airport
		
		String City="PGGG";
		switch (City) {
		case "PNQ":System.out.println("welcome to Pune Airport");
			break;
		case "BOM":System.out.println("welcome to Mumbai Airport");
		    break;
		case "NGP":System.out.println("welcome to Nagpur Airport");
		    break;
		    

		default:System.out.println("please enter valid city between pune mumbai and nagpur");
			break;
		}

	}

}
