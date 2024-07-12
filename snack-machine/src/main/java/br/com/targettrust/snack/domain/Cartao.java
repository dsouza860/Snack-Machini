package br.com.targettrust.snack.domain;

import java.util.Scanner;

public class Cartao extends FormaPagamento {

	public Cartao(Float forma) {
		super();
	}

	@Override
	public void realizarPagamento(Float valor) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe o número do cartão:");
		Integer numero = ler.nextInt();
		System.out.println("Informe a validade: ");
		Integer validade = ler.nextInt();
		System.out.println("Informe o ccv");
		Integer ccv = ler.nextInt();
	}
}
