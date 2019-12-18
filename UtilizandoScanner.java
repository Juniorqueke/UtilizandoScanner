package oOP;

import java.util.Scanner;

public class UtilizandoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String palavra = sc.nextLine();
		// recebe o que o usuário utiliza até a quebra de linha
		String x, y, z;
		x = sc.next();
		y = sc.next();
		z = sc.next();

		System.out.println(palavra);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		// ler as coisas em linhas distintas

		sc.close();
		// para fechar a variavel scanner e fazer com que ela não receba mais nada
	}

}
