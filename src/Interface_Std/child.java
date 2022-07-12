package Interface_Std;

public class child implements Father, Mother{

	public static void main(String[] args) {
		child ad= new child();
		ad.cooking();
		ad.receipe();
		ad.property();
		ad.money();

	}

	@Override
	public void receipe() {
		System.out.println("this is mothers property");
		
	}

	@Override
	public void cooking() {
		System.out.println("this is mothers property");
	}

	@Override
	public void money() {
		System.out.println("this is fathers property");
		
	}

	@Override
	public void property() {
		System.out.println("this is fathers property");
		
	}

}
