package demo;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) throws Exception{
    try{
        System.out.println("Unesite dva broja:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        int ans;
        System.out.println("Unesite opciju za izbor operacije: 1 za Sabiranje, 2 za Oduzimanje, 3 za Mnozenje, 4 za Dijeljenje,5 za Kvadratiranje i 6 za Korjenovanje :");
        int choose;
        choose = inp.nextInt();
        switch (choose){
        case 1:
            System.out.println(sabiranje( num1,num2));
            break;
        case 2:
            System.out.println(oduzimanje( num1,num2));
            break;      
        case 3:
            System.out.println(mnozenje( num1,num2));
            break;
        case 4:
            System.out.println(dijeljenje( num1,num2));
            break;
        case 5:
            System.out.println(kvadratiranje( num1,num2));
            break;
        case 6:
            System.out.println(korjenovanje( num1,num2));
            break;
            
            default:
                System.out.println("Nedostupna Operacija");
        }
    }catch(Exception e){
    	e.getMessage();
    }
            
       

      
        	
        
    



    }

	public static double korjenovanje(int num1,int num2) {
		// TODO Auto-generated method stub
		return  0;
	}

	public static double kvadratiranje(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static double dijeljenje(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static double mnozenje(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static double oduzimanje(int num1,int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static double sabiranje(int num1,int num2) {
		// TODO Auto-generated method stub
		return 0;
	}
}