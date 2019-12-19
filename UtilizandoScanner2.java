package oOP;

import java.util.Locale;
import java.util.Scanner;

public class UtilizandoScanner2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		// para definir como padrão o ponto e não a virgula 
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt(); // idade
		sc.nextLine();
		// Next line vazio para limpar a quebra de linha que fica faltando
		String name = sc.nextLine(); // nome
		char gender = sc.next().charAt(0); // genero M ou F
		// charAt Serve para pegar o primeiro caracter que for digitado Exemplo M ou F
		String s = sc.next();
		char letter = s.charAt(0);
		// para pegar o primeiro caracter digitado na variavel s
		int number = Integer.parseInt(s.substring(1)); // b5
		// faz a conversão de número para string e após isso
		// pega apenas a segunda letra digitada na variavel s no caso o numero 5
		double n2 = sc.nextDouble();
		
		String name2 = sc.next(); //maria
		char ch = sc.next().charAt(0); // F
		// charAt Serve para pegar o primeiro caracter que for digitado Exemplo M ou F
		int age = sc.nextInt(); // 23
		double height = sc.nextDouble(); //  1.68	
		
		

		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(letter);
		System.out.println(number);
		System.out.println(n2);
		System.out.println(name2);
		System.out.println(ch);
		System.out.println(age);
		System.out.println(height);
		sc.close();
	}

}
