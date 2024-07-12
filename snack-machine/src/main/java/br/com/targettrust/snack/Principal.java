package br.com.targettrust.snack;

import br.com.targettrust.snack.domain.SnackMachine;
import br.com.targettrust.snack.domain.Fileira;

import java.util.List;

public class Principal {

    public static void main(String[] args) throws Exception {

        FluxoRecarga recarga = new FluxoRecarga();
		FluxoAtendimento atendimento = new FluxoAtendimento();
		atendimento.executar(recarga.executar());




    }
}
