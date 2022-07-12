package VariableStudy;

public class StudyNonStatic {
	int a=10;
	int b=20;

	public static void main(String[] args) {
		StudyNonStatic n = new StudyNonStatic();
		n.m1();
		System.out.println("non static global variable "+n.a+" "+n.b);
		
	}

	
	public void m1() {
		
		int c=30;
	//	a=15;
		b=30;
		
		System.out.println("value of c "+c);
		
		System.out.println("non Static variable from same class "+a+" "+b);
		
	}
	
	
	
}
