//represents the highly specialized "HARVARD" lawyer
public class HarvardLawyer extends Lawyer {
	/* FIELDS */
	private int numberOfVacationFormsRequired = 4;
	
	/* METHODS */
	@Override
	public String getVacationForm() {
		String result = "";
		for (int i = 0; i < numberOfVacationFormsRequired; i++) {
			 result += super.getVacationForm();
		}
		return result;
	}
	
	@Override
	public int getVacationDays() {
		return super.getVacationDays() + 3;
	}
	
	@Override
	public double getSalary() {
		return super.getSalary() * 1.2;
	}
}
