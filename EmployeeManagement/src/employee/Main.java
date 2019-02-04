
package employee;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("\t\t\t\t*** Welcome To Employee Management ***");
		Menu mn = new Menu();
		mn.showMenu();
        Scanner sc = new Scanner(System.in);
        mn.option(sc.nextInt());
        sc.close();
	}

}
