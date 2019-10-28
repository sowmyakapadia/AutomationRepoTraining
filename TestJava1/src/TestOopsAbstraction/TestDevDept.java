package TestOopsAbstraction;

public class TestDevDept implements TestBUHead{

	@Override
	public void BellCurve() {
		System.out.println("To submit employee names in Dev Dept with 4 rating");
		
	}

	@Override
	public void Increment() {
	System.out.println("To submit employee names in Dev Dept eligible for salary increment");
		
	}

	@Override
	public void Promotion() {
		System.out.println("To submit employee names in Dev Dept eligible for promotion");
		
	}

}
