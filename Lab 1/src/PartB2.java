import java.util.Scanner;
public class PartB2 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("What is your filing status? Single, Married "
				+ "filing jointly (qualifying widow(er), or Married filing separately?");
		String user = input.nextLine();
		
		if (user.equalsIgnoreCase("single")){
			Single();
		}
		
		if(user.equalsIgnoreCase("Married filing jointly") || user.equalsIgnoreCase("qualifying widower")){
			MarriedJointly();
		}
		
		if(user.equalsIgnoreCase("Married filing separately")){
			MarriedSeparate();
		}
	}
	
	public static void Single(){
		System.out.println("What is your taxable income?");
		int income = input.nextInt();
	}
	
	public static void MarriedJointly(){
		System.out.println("What is your taxable income?");
		int income = input.nextInt();
	}
	
	public static void MarriedSeparate(){
		System.out.println("What is your taxable income?");
		int income = input.nextInt();
	}

}
