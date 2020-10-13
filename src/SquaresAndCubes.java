import java.util.Scanner;

public class SquaresAndCubes {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		while (true) {
			System.out.println("Enter a number:");
			int num1 = scnr.nextInt();
			System.out.println("Number " + " " + " Squared " + " " + " Cubed ");
			System.out.println("-------" + " " + " --------" + " " + "-----");
			System.out.println("-------" + " " + " --------" + " " + "-----");

			for (int i = 1; i <= num1; i++) {
				int square = (i * i);
				int cube = (i * i * i);
				System.out.printf("%-10d %-10d %-10d", i, square, cube);
				System.out.println();
			}

			System.out.println("Would you like to continue y/n?");
			if (scnr.next().equals("n")) {
				break;
			}

		}
		while (true) {
			System.out.println("Let's Mulityply:");
			System.out.println("Enter a number:");
			int num1 = scnr.nextInt();

			for (int i = 1; i <= num1; i++) {
				System.out.printf("%4d", i);
			}
			System.out.println();
			System.out.println("----------------------");
			for (int i = 1; i <= num1; i++) {
				System.out.printf("%4d |", i);

				for (int j = 1; j <= num1; j++) {
					System.out.printf("%4d", i * j);
				}
				System.out.println();
			}
			System.out.println("Would you like to continue y/n?");
			if (scnr.next().equals("n")) {
				break;
			}
		}


	}

}
