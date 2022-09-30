package testpackage;

public class Test2 {

	public static void main(String[] args) {
		String hungry = "yes";
		
		if (hungry == "yes" || hungry == "YES" || hungry == "Yes") {
			System.out.println("eat something....");
		}else {
			System.out.println("Do work....");
		}
	}

}
