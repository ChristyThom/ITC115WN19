package chapter4;

public class homework4 {

public static void main(String[] args) {
		
		System.out.println(repl("I need MONEY!!!! ", 5));
		System.out.println();
		System.out.println(repl("MONEY! MONEY! MONEY! ", 3));
		System.out.println();
		System.out.println(repl("Financial Aid SUCKS! ", 2));
		System.out.println();
		System.out.println(repl("Being a student is awesome - money woes are painful! ", 2));
		System.out.println();
		System.out.println(repl("TODAY I will GET MONEY!! ", 2));
		
	}
	
	public static String repl(String s, int n) {
		String words = "";
		for (int i =1; i <= n; i++) {
			words = words + s;
		}
		return words;
	}

}