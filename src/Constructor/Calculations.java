package Constructor;

public class Calculations {
	
	int a;
	int b;
	String abc;
	float d;
	
	public Calculations(int x,int y,String z,float w )
	{
		a=x;//100
		b=y;//200
		abc=z;//megha
		d=w;//20.5f
	}
	
	public void add()
	{
		int sum=a+b;
		System.out.println("Sum is "+sum);
		int sub=a-b;
		System.out.println("Sub is "+sub);
		System.out.println("name is "+abc);
		System.out.println("weight is "+d);
	}

	public static void main(String[] args) {
		
		Calculations c1=new Calculations(100, 200,"megha", 20.5f);
		c1.add();
		

	}

}
