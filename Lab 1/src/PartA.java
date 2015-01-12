import java.util.Scanner;
public class PartA {

	static Scanner user = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Was your dependent physically present in the United "
				+ "States on at least 31 days during 2013?");
		String info = user.nextLine();

		if (info.equalsIgnoreCase("yes")){
			System.out.println("How many days was your dependent present in the United " 
					+ "States during 2013?");
			int a = user.nextInt();

			if(a >= 183){
				System.out.println("Your dependent is a resident alien for U.S. tax purposes");

			}

			if(a < 183){
				System.out.println("How many days was your dependent present in the "
						+ "United States during 2012?");
				int b = user.nextInt()/3;

				System.out.println("How many days was your dependent present in the "
						+ "United States during 2011?");
				int c = user.nextInt()/6;

				int d = c + b + a;

				if(d >= 183){

					if(a < 183){
						Scanner scan = new Scanner(System.in);
						System.out.println("For 2013, did your dependent have a tax home in a " 
								+ "foreign country and a closer connection to that country than " 
								+ "to the United States?");
						String more = scan.nextLine();

						if("yes".equalsIgnoreCase(more)){
							System.out.println("Your dependent is a nonresident  alien for U.S. " 
									+ "tax purposes.");
						}

						if("no".equalsIgnoreCase(more)){
							System.out.println("Your dependent is a resident alien for U.S. "
									+ "tax purposes");
						}

					}
				}

				if(d < 183){
					System.out.println("Your dependent is a nonresident alien for U.S. tax "
							+ "purposes.");
				}
			}


		}else{
			System.out.println("Your dependent is a nonresident alien for U.S. tax purposes");
		}

	}

}
