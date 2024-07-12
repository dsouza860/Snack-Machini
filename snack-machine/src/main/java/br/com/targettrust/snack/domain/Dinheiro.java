package br.com.targettrust.snack.domain;

import java.util.Scanner;

public class Dinheiro extends FormaPagamento{
	public Dinheiro(Float forma) {
		super();
	}

	@Override
	public void realizarPagamento(Float valor) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Insira o valor em dinheiro: ");
		Float quantia = ler.nextFloat();
		if(quantia >= valor){
			Float troco = quantia - valor;
			System.out.println("Pagamento realizado com sucesso! Seu troco: " + troco);
		}else{
			System.out.println("Valor inserido insuficiente!");
		}
	}
}
