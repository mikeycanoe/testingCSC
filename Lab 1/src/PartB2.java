import java.util.Scanner;
public class PartB2 {

	static Scanner input = new Scanner(System.in);
	static String What_Is = ("What is your taxable income?");
	static String Taxes = ("Your tax is $");
	
	public static void main(String[] args) {
		System.out.println("What is your filing status? Single, Married "
				+ "filing jointly (qualifying widow(er)), \nMarried filing separately"
				+ ", or Head of household?");
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
		
		if(user.equalsIgnoreCase("Head of household")){
			HeadOf();
		}
	}
	
	public static void Single(){
		System.out.println(What_Is);
		float income = input.nextInt();
		
		if(income > 36250 && income <= 87850){
			double tax= 4991.25 + (.25 * ((income - (income % 50) + 25) - 36250));
			System.out.println(Math.round(tax));
			
		}
		
		if(income > 87850 && income <= 183250){
			if(income >= 100000){
				double tax =((income * .28) - 6706.75);
				System.out.println(Taxes + tax);
			}
			if(income < 100000){
				double tax = 17891.25 + (.28 * ((income - (income % 50) + 25) - 87850));
				System.out.println(Taxes + Math.round(tax));
			}
		}
	}
	
	public static void MarriedJointly(){
		System.out.println(What_Is);
		int income = input.nextInt();
		
		if(income > 72500 && income <= 146400){
			if(income >= 100000){
				double tax = (income * .25) - 8142.50;
				System.out.println(Taxes + tax);
			}
			if(income < 100000){
				double tax = 9982.5 + (.25 * ((income - (income % 50) + 25) - 72500));
				System.out.println(Taxes + Math.round(tax));
			}
		}
	}
	
	public static void MarriedSeparate(){
		System.out.println(What_Is);
		int income = input.nextInt();
		
		if(income > 73200 && income <= 111525){
			if(income >= 100000){
				double tax = (income * .28) - 6267.25;
				System.out.println(Taxes + tax);
			}
			if(income < 100000){
				double tax = 14228.75 + (.28 * ((income - (income % 50) + 25) - 73200));
				System.out.println(Taxes + Math.round(tax));
			}
		}
	}
	
	public static void HeadOf(){
		System.out.println(What_Is);
		int income = input.nextInt();
		
		if(income > 48600 && income <= 125450){
			if(income >= 100000){
				double tax = (income * .25) - 5497.50;
				System.out.println(Taxes + tax);
			}
			if(income < 100000){
				double tax = 6652.5 + (.25 * ((income - (income % 50) + 25) - 48600));
				System.out.println(Taxes + Math.round(tax));
			}
		}
	}
}

