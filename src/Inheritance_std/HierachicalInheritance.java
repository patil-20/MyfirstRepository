package Inheritance_std;

public class HierachicalInheritance {

	public static void main(String[] args) {
		
		Father f= new Father();
		f.Emotions();
		Father.Love();
		
		Daughter d=new Daughter();
		d.Scooty();
		Daughter.Cycle();
		d.Emotions();
		Daughter.Love();
		
		Son1 s= new Son1();
		s.Bike();
		Son1.cars();
		s.Emotions();
		Son1.Love();
		

	}

}
