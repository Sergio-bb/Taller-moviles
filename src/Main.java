
import java.util.Scanner;

public class Main {
	static Scanner reader = new Scanner(System.in);	
	public static void main(String[] args) {		
		tableManagement();
	}
	
	private static void tableManagement() {
		int option = 0;
		do{
			System.out.print("*******************Muerte Lenta******************* \n");
			System.out.print("**************************************************\n");	
			System.out.print("1. Tomar pedido. \n");
			System.out.print("0. Salir. \n");
			option = reader.nextInt();
			if(option == 1) {
				registerTable();
			}
		}while(option != 0);
		
	}
	public static void registerTable() {
		System.out.print("Ingrese la cantidad de personas: \n");
		int numberOfPeople = reader.nextInt();
		int price = 0;	
		int lastPlate = 0;
		Boolean isDuplicatedPlate = false;
		for(int i = 1 ;i <= numberOfPeople; i++ ) {
			System.out.print("Ingrese el plato que desea ordenar: \n");
			System.out.print("1. Hamburguesa. \n");
			System.out.print("2. Perro. \n" );
			System.out.print("3. Salchipapa. \n");
			System.out.print("4. Chorizo. \n");

int plate  = reader.nextInt();
			if(lastPlate == plate) {
				isDuplicatedPlate = true;
			}
			lastPlate = plate;			
			switch (plate) {
				case 1 -> price += 10000;			
				case 2 -> price += 8000;
				case 3 -> price += 6000;
				case 4 -> price += 7000;			
			}
					}
		if(price > 20000) {
			price  = (int)(price * 0.9);						
		}
		if(isDuplicatedPlate) {
			price = (int) (price * 0.95);
		}
		System.out.print("Desea incluir propina? Y/N \n");
		String includeTip = reader.next();
		if(includeTip.equals("y")|| includeTip.equals("Y")) {
			price+= (int)(price * 0.1);
		}
		int tip = (int)(price * 0.1);
		System.out.println("Propina : " + tip);
		System.out.println("Su cuenta es: " + price);
	}
}