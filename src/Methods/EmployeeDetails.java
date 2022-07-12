package Methods;

public class EmployeeDetails {

	public static void main(String[] args) {
    EmployeeDetails ed= new EmployeeDetails();
    ed.EmployeeInfo();
    ed.playersInfo("Mohan", 22, 60.8f, 135.65d,'M');
    ed.playersInfo("Sarita", 20, 50.5f, 126.45d, 'F');
    

	}
	
		public void EmployeeInfo()
		{
		// name, salary, gender,bloodgroup
		
		String name="Priya Patil";
		int salary=22000;
		char gender='F';
		String bloodgroup="AB-";
		
		{
		System.out.println("***************************************");
		System.out.println("Employee Name is "+name);
		System.out.println("Employee salary is "+salary);
		System.out.println("Employee gender is "+gender);
		System.out.println("Employee bloodgroup is "+bloodgroup);
		System.out.println("***************************************");
		}
		}
	
		
		//Name,age,weight,height,gender
		
		
		public void playersInfo(String name,int age,float weight,double height,char Gender)
		
		{
		System.out.println("**************************************");
		System.out.println("Player Name is "+name);
		System.out.println("Player age is "+age);
		System.out.println("Player weight is "+weight);
		System.out.println("Player height is "+height);
		System.out.println("Player gender is "+Gender);
		System.out.println("**************************************");
		}}
		

