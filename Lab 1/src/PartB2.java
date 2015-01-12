import java.util.Scanner;
public class PartB2 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("What is your filing status? Single, Married "
<<<<<<< HEAD
				+ "filing jointly (qualifying widow(er)), \nMarried filing separately"
				+ " or Head of household?");
=======
				+ "filing jointly (qualifying widow(er), or Married filing separately?");
>>>>>>> fb27aa43dfdf19c970ae0cdc7abff44ba771c090
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
<<<<<<< HEAD
		
		if(user.equalsIgnoreCase("Head of household")){
			HeadOf();
		}
=======
>>>>>>> fb27aa43dfdf19c970ae0cdc7abff44ba771c090
	}
	
	public static void Single(){
		System.out.println("What is your taxable income?");
		int income = input.nextInt();
<<<<<<< HEAD
		
=======
>>>>>>> fb27aa43dfdf19c970ae0cdc7abff44ba771c090
	}
	
	public static void MarriedJointly(){
		System.out.println("What is your taxable income?");
		int income = input.nextInt();
	}
	
	public static void MarriedSeparate(){
		System.out.println("What is your taxable income?");
		int income = input.nextInt();
	}
<<<<<<< HEAD
	
	public static void HeadOf(){
		System.out.println("What is your taxable income?");
		int income = input.nextInt();
	}
=======
>>>>>>> fb27aa43dfdf19c970ae0cdc7abff44ba771c090

}
