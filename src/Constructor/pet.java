package Constructor;



public class pet {
	String a;
	int b;
	String c;                        //variable declaration
	float e;
	double f;
	
	public pet(String x, int y, String z, float m, double n)
	
	{
		a=x;
		b=y;
		c=z;
		e=m;
		f=n;
		
				
	}
	public static void main(String[] args) {
		{
			pet d11= new pet("Tommy",8,"Black", 12.5f,25.5d);
			
			d11.details();
		}
		
		

	}
public void details()
{
	//name="tommy";
	//age='8';
	//colour="black";          //variable initilization
	//height=12.5f;
	//weight=25.5d;
	
	System.out.println("dog name is "+a);
	System.out.println("his age is "+b);
	System.out.println("colour is "+c);
	System.out.println("height is "+e);
	System.out.println("weight is "+f);
}
}
