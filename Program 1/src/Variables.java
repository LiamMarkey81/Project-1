
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte age;
		int gradeValue = 94;
		char grade = 'A';
		String firstName = "Liam";
		String lastName = "Markey";
		
		
		gradeValue = 96;
		gradeValue = gradeValue + 2;
		//gradeValue = 96 + 2 or 98
		
		age = 18;
		
		System.out.println("Grade: " + gradeValue);
		System.out.println("My name is: " + firstName + " " + lastName);
		
		//System.out.println("My age is: " + "age"); If quotes are used, text in quotations is printed as words not variable value
		System.out.println("My age is: " +  age);
		//Printing a menu to the output
		System.out.print("Menu\n");
		System.out.print("\tMilk\n");
		System.out.print("\tCookies\n");
		System.out.print("\tChurros");
		
	}

}
