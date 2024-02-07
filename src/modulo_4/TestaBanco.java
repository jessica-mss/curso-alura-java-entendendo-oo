package modulo_4;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(100);
		Conta conta2 = new Conta(200);
		Conta conta3 = new Conta(300);
		Conta conta4 = new Conta(400);
		
		Banco banco = new Banco();
		banco.adicionarConta(conta);
		banco.adicionarConta(conta2);
		banco.adicionarConta(conta3);
		banco.adicionarConta(conta4);
		
		banco.exibirContas();
	}

}
