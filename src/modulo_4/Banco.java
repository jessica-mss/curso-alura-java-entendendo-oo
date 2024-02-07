package modulo_4;

import java.util.ArrayList;

//Crie uma classe chamada "Banco" que possua um atributo do tipo ArrayList de Conta, chamado "contas".
//Em seguida, crie um método chamado "adicionarConta" que recebe como parâmetro uma instância da classe Conta 
//e adiciona essa conta à lista de contas do banco. Por fim, crie um método chamado "exibirContas" que 
//percorre a lista de contas e exibe o saldo de cada uma delas.

public class Banco {
	
	private ArrayList<Conta> contas = new ArrayList<>();
	
	public void adicionarConta(Conta novaConta) {
		this.contas.add(novaConta);
	}
	
	public void exibirContas() {
		for (Conta conta : contas) {
			System.out.println("saldo = " + conta.saldo);
		}
	}
	

}
