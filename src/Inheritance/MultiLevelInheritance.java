package Inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		
		GrandMother gm=new GrandMother();
		gm.receipe();//calling own property
		gm.Stories();
		
		Mother m= new Mother();
		m.nature(); //calling own property
		m.care();
		m.receipe();//calling super class method from sub class object
		
		Child c= new Child();
		c.Laptop(); //calling own property
		c.Mobile();//calling own property
		c.nature(); //calling super class property using child's object(mother)
		c.care();  //calling super class property using child's object(mother)
		c.receipe(); //calling super class property using child's object(grandmother)
		c.Stories();//calling super class property using child's object(grand mother)
		

	}

}
