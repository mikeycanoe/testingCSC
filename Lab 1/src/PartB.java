import java.util.Scanner;
public class PartB {

	static Scanner user = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Is your dependent single or married?");
		String input = user.nextLine();
		
		if(input.equalsIgnoreCase("Single")){
			single();
		}
		
		if(input.equalsIgnoreCase("Married")){
			married();
		}

	}
	
	public static void single() {
		System.out.println("Were you either age 65 or older or blind?");
		String doI = user.nextLine();
		
		if(doI.equalsIgnoreCase("no")){
			System.out.println("You must file a return if any of the following apply."
					+ "\nYour unearned income was over $1,000."
					+ "\nYour earned income was over $6,100."
					+ "\nYour gross income was more than the LARGER of -"
					+ "\n\t$1,000, or"
					+ "\n\tYour earned income (up to $5,750) plus $350");
		}
		
		if(doI.equalsIgnoreCase("yes")){
			System.out.println("You must file a return if any of the following apply."
					+ "\nYour unearned income was over $2,500 ($4,000 if 65 or older AND blind."
					+ "\nYour earned income was over $7,600 ($9,100 if 65 or older AND blind)."
					+ "\nYour gross income was more than the LARGER of -"
					+ "\n\t$2,500 ($4,000 if 65 or older AND blind), or"
					+ "\n\tYour earned income (up to $5,750) plus $1,850 ($3,350 if 65 or older AND blind");
		}
		
	}
	
	public static void married(){
		System.out.println("were you either age 65 or older or blind?");
		String wat = user.nextLine();
		
		if(wat.equalsIgnoreCase("no")){
			System.out.println("You must file a return if any of the following apply."
					+ "\nYour unearned income was over $1,000."
					+ "\nYour earned income was over $6,100."
					+ "\nYour gross income was at least $5 and your spouse files a separate return and itemizes deductions"
					+ "\nYour gross income was more than the LARGER of -"
					+ "\n\t$1,000, or"
					+ "\n\tYour earned income (up to $5,750) plus $350");
		}
		
		if(wat.equalsIgnoreCase("yes")){
			System.out.println("You must file a return if any of the following apply."
					+ "\nYour unearned income was over $2,200 ($3,400 if 65 or older AND blind."
					+ "\nYour earned income was over $7,300 ($8,500 if 65 or older AND blind)."
					+ "\nYour gross income was at least $5 and your spouse files a separate return and itemizes deductions."
					+ "\nYour gross income was more than the LARGER of -"
					+ "\n\t$2,200 ($3,400 if 65 or older AND blind), or"
					+ "\n\tYour earned income (up to $5,750) plus $1,550 ($2,750 if 65 or older AND blind");
		}
	}
	

}
