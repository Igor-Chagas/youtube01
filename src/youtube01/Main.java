package youtube01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a largura do terreno [m]: ");
		double larg = sc.nextDouble();
		System.out.println("Entre com o comprimento do terreno [m]: ");
		double comp = sc.nextDouble();
		System.out.println("Entre com o valor do m2 [R$/m2]: ");
		double val = sc.nextDouble();
		
		double s = larg * comp;
		double ctotal = val * s;
		System.out.printf("Area = %.2f m2\n", s);
		System.out.printf("Preco = R$ %.2f%n", ctotal);
		
	sc.close();
	}

}
