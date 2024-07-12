package br.com.targettrust.snack.domain;

import br.com.targettrust.snack.enumerations.EnumStatusMaquina;

import java.util.ArrayList;
import java.util.List;

public class SnackMachine {
	private List<Fileira> fileiras;
	private EnumStatusMaquina status;

	public SnackMachine(int numeroProdutos) {
		this.fileiras = new ArrayList<>(numeroProdutos);
	}
	public void addProduto(Fileira produto) {
        this.fileiras.add(produto);
    }
	public void setStatus(EnumStatusMaquina status){
		this.status = status;
	}

	@Override
	public String toString() {
		return 	"Fileiras: " + fileiras + '\n' +
				"Status: " + status + '\n';


	}
}
