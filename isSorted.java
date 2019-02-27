
public class isSorted {

	public static void main(String[] args) {
		double[] list1 = {16.1, 12.3, 22.2, 14.4};
		double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};


		
		System.out.println(isSorted(list1));
		System.out.println(isSorted(list2));

	}
	
	public static boolean isSorted(final double[] list) {
		if (list.length > 1) { 
			for (int i = 0; i < list.length - 1; i++) {  
				if (list[i] > list[i + 1]) { // if current number is greater return false
					return false;          
				}  
			}
		}
		return true; 
	}
}