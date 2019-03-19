//represents lawyers
public class Lawyer extends Employee {

	//methods
	@Override
	public String getVacationForm() {
		return "pink";
	}
	
	@Override
	public int getVacationDays() {
		return 15;
	}
	
	@Override
	public double getSalary() {
		return 100000.0;
	}
	
	public void sue() {
		System.out.println("I'll see you in court.");
	}
}
