//represents janitors
public class Janitor extends Employee {
	
	/* METHODS */
	@Override
	public int getHours() {
		return super.getHours() * 2;
	}
	
	@Override
	public double getSalary() {
		return super.getSalary() - 10000.0;
	}
	
	@Override
	public int getVacationDays() {
		return super.getVacationDays() / 2;
	}
	
	public void clean() {
		System.out.println("Workin' for the man.");
	}
}
