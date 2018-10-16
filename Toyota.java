
public class Toyota extends Car {
	public Toyota() {
		// TODO Auto-generated constructor stub
		double mpg = mpg(60.3, 1.9);
	}

	@Override
	public void setUpComputer() {
		// TODO Auto-generated method stub
		System.out.println("Computer set up");
		
	}

	@Override
	public void tireSize(int year, String model) {
		// TODO Auto-generated method stub
		System.out.println("For the model" + " " + model + " " +  "you need a small tire");
	}
	
	
	
}
