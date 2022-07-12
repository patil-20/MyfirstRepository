package Inheritance_1;

public class My_Calculations extends Calculations{
	public void Multiplication(int x, int y) {
		int a=x*y;
		System.out.println("the product of given number is "+a);
	}

	public static void main(String[] args) {
		int a=20; int b=10;
		My_Calculations demo=new My_Calculations();
		Calculations c= new Calculations();
		{
			
		
		c.addition(a, b);
	//	c.Substration(a, b);
		
		demo.addition(a, b);
		
    //    demo.Substration(a, b);
        demo.Multiplication(a, b);
	}

	}}
