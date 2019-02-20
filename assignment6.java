package chapter6;

import java.io.*;
import java.util.*;

public class assignment6 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("boysgirls.txt");
		Scanner input = new Scanner(f);
		
		boyGurl(input);
	}
	
	public static void boyGurl(Scanner fileInput) {
		//variables
		int totalBoy = 0;
		int totalGirl = 0;
		int sumBoy = 0;
		int sumGirl = 0;
		int ct = 0;
		
		while (fileInput.hasNext()) {
			if (ct % 2 == 0) {
				totalBoy++;
				sumBoy += readNum(fileInput);
			} else {
				totalGirl++;
				sumGirl += readNum(fileInput);
			}
			ct ++;
		}
		
		System.out.println();
		System.out.println("The info comes from (filename): \"boysgirls.txt\"");
		dblSpace();
		System.out.println("The total number of BOYS names is: " + totalBoy);
		dblSpace();
		System.out.println("The total number of GIRLS names is: " + totalGirl);
		dblSpace();
		System.out.println("The difference between the sums is: " + Math.abs(sumBoy - sumGirl));
		dblSpace();
		System.out.println("The total number of names in the file is: " + ct);
		dblSpace();
		System.out.println("The total sum for the boys and the girls is: " + Math.abs(sumBoy + sumGirl));
	}
	
	public static int readNum(Scanner fileInput) {
		@SuppressWarnings("unused")
		String name = fileInput.next();
		int num = fileInput.nextInt();
		return num;
	}
	
	public static void dblSpace() {
		System.out.println();
		System.out.println();
	}
}