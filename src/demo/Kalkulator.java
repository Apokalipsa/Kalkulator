package demo;

import java.util.Scanner;

public class Kalkulator {
	public static void main(String[] args) throws Exception {
		try {
			System.out.println("Unesite dva broja:");
			Scanner inp = new Scanner(System.in);
			int num1, num2;
			num1 = inp.nextInt();
			num2 = inp.nextInt();
			int ans;
			System.out.println(
					"Izbor operacije:\n1 Sabiranje \n2 Oduzimanje \n3 Mnozenje \n4 Dijeljenje \n5 Korjenovanje \n6 Kvadriranje \n7 Izlaz");
			int choose;
			choose = inp.nextInt();
			switch (choose) {
			case 1:
				System.out.println("Rezultat : " + sabiranje(num1, num2));
				
				break;
			case 2:
				System.out.println("Rezultat : " + oduzimanje(num1, num2));
				
				break;
			case 3:
				System.out.println("Rezultat : " + mnozenje(num1, num2));
				
				break;
			case 4:
				System.out.println("Rezultat : " + dijeljenje(num1, num2));
				
				break;
			case 5:
				System.out.println("Rezultat : " + kvadratiranje(num1, num2));
				
				break;
			case 6:
				System.out.println("Rezultat : " + korjenovanje(num1, num2));
				
				break;
			
		case 7: {
			System.out.println("Hvala Vam na koristenju nasih usluga! ");
			System.exit(1);
		}

			default:
				System.out.println("Nedostupna Operacija");
			}
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public static double korjenovanje(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static double kvadratiranje(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static double dijeljenje(int num1, int num2) {

		return num2 > 0 ? num1 / num2 : 0.0;
	}

	public static double mnozenje(int num1, int num2) {

		return (num1 * num2);
	}

	public static double oduzimanje(int num1, int num2) {

		return num1 - num2;
	}

	public static double sabiranje(int num1, int num2) {
		return num1 + num2;
	}
}