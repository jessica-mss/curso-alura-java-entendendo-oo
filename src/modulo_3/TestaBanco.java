package modulo_3;

public class TestaBanco {
	
	public static void main(String[] args) {
		Conta contaAna = new Conta(500);
		Conta contaJoao = new Conta(500);
		Banco banco = new Banco();
		banco.realizaTransferencia(100, contaAna, contaJoao);
	}

}
