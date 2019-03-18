//represents marketers
public class Marketer extends Employee {

	/* METHODS */
	@Override
	public double getSalary() {
		return 50000.0;
	}
	
	public void advertise() {
		System.out.println("Act now, while supplies last!");
	}
}
