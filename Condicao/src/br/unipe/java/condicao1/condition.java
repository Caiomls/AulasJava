package br.unipe.java.condicao1;
import java.util.Scanner;

public class condition {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int val;

		System.out.println("Digite o n�mero: \n");
		val = ler.nextInt();

		if (val == 10) {
			System.out.println("Valor == 10");
		} else {
			System.out.println("Valor != 10");
		}

		System.out.println("Isso � enrola��o");
		ler.close();
	}
}
