import java.text.NumberFormat;

public class EmployeeMain {

	public static void main(String[] args) {
		//create an array of all employee types
		Employee[] employees = { new Secretary(),
								 new LegalSecretary(),
								 new Lawyer(), 
								 new HarvardLawyer(),
								 new Marketer(),
								 new Janitor()
		};
		
		//test methods that are common across each employee class
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getClass().toString().substring(6));
			System.out.println("My salary is " + NumberFormat.getCurrencyInstance().format(employees[i].getSalary()) + ".");
			System.out.println("I receive " + employees[i].getVacationDays() + " days of vacation.");
			System.out.println("My vacation form is: " + employees[i].getVacationForm() + ".");
			System.out.println();
		}
		
		//test methods that are unique to each employee class
		Secretary s = new Secretary();
		s.takeDictation("Set up a meeting for 1 o'clock on Thursday.");
		
		LegalSecretary ls = new LegalSecretary();
		ls.fileLegalBriefs();
		
		Lawyer l = new Lawyer();
		l.sue();
		
		Marketer m = new Marketer();
		m.advertise();
		
		Janitor j = new Janitor();
		j.clean();
	}

}
