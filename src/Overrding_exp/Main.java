package Overrding_exp;

public class Main {

	public static void main(String[] args) {
		
		parent p = new child();
		p.buildingConstruction();
		Main obj =new Main();
		obj.addition();
		obj.addition(100, 200);
		obj.addition(10.5f, 20.5f);
		Main.addition(10);

	}
	
	public void addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void addition(int a)
	{
		int x=10;
		System.out.println(x);
	}
	private void addition(int m, int n)
	{
		int sum=m+n;
		System.out.println("addition is "+sum);
	}
	protected void addition(float a,float b)
	{
		float sum=a+b;
		System.out.println("addition is "+sum);
	}

}
