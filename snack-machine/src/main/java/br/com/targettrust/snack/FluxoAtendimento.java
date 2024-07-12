package br.com.targettrust.snack;

import br.com.targettrust.snack.domain.Cartao;
import br.com.targettrust.snack.domain.Dinheiro;
import br.com.targettrust.snack.domain.FormaPagamento;
import br.com.targettrust.snack.domain.Produto;
import br.com.targettrust.snack.exceptions.ProdutoNaoEncontradoException;

import java.util.*;

public class FluxoAtendimento {

	public void executar(List<Produto> produtos) {

		System.out.println("## Fluxo de atendimento:");
		System.out.println("Informe o código do produto");

		Scanner scanner = new Scanner(System.in);
		Long codigo = scanner.nextLong();


		Optional<Produto> prod = produtos.stream()
				.filter(p -> p.getCodigo().equals(codigo))
				.findFirst();
		Produto produtoDesejado = prod.orElseThrow(() ->
				(new ProdutoNaoEncontradoException("Produto não encontrado")));

		System.out.println("Preço: " + produtoDesejado.getPreco());

		System.out.println("Qual será a forma de pagamento?");
		System.out.println("Se for cartão de crédito/débito, informe 1");
		System.out.println("Se for dinheiro, informe 2");
		int formaPagamento = scanner.nextInt();

		FormaPagamento pagamento = null;
		System.out.println("Informe a forma de pagamentos: ");
		Float forma = scanner.nextFloat();

		switch (formaPagamento) {
			case 1:
                pagamento = new Cartao(forma);
                break;
            case 2:
                pagamento = new Dinheiro(forma);
                break;
            default:
                throw new IllegalArgumentException("Forma de pagamento inválida!");
		}
		pagamento.realizarPagamento(forma);






	}
}
