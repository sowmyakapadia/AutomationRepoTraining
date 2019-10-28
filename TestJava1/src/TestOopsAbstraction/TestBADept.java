package TestOopsAbstraction;

public class TestBADept implements TestBUHead {

	@Override
	public void BellCurve() {
		System.out.println("To submit employee names in BA dept with rating of 4");
		
	}

	@Override
	public void Increment() {
		System.out.println("To submit employee names of Ba dept eligible for salary increment");		
	}

	@Override
	public void Promotion() {
		System.out.println("To submit employee names of BA Dept eligible for promotion");
		
	}

}
