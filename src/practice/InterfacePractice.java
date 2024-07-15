package practice;

public class InterfacePractice implements TracfficeRules{

	public static void main(String[] args) {
		ObjectCreationPractice obj = new ObjectCreationPractice();
		obj.getData();
		
		TracfficeRules ip = new InterfacePractice();
		ip.greenGo();
		ip.yellowFalshy();
		ip.redStop();
		
		InterfacePractice ip1 = new InterfacePractice();
		ip1.createData();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("going green");
	}

	@Override
	public void yellowFalshy() {
		// TODO Auto-generated method stub
		System.out.println("yellow falshy");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("red stop");
	}
	
	public void createData() {
		System.out.println("creating the data");
	}

}
