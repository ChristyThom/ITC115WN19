//represents legal secretaries
public class LegalSecretary extends Secretary {
	
	//methods
	@Override
	public double getSalary() {
		return super.getSalary() + 5000;
	}
	
	public void fileLegalBriefs() {
		System.out.println("I can file all day!");
	}
	
}
