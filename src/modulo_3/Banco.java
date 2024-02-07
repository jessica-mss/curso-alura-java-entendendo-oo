package modulo_3;

public class Banco {
		
	public boolean realizaTransferencia(double valor, Conta contaOrigem, Conta contaDestino) {
//		double saldoOrigem = contaOrigem.saldo;
//		double saldoDestino = contaDestino.saldo;
		if (contaOrigem.saldo >= valor) {
			System.out.println("Saldo inicial origem: " + contaOrigem.saldo);
			System.out.println("Saldo inicial destino: " + contaDestino.saldo);			
			contaOrigem.saldo -= valor;
			contaDestino.saldo += valor;
			System.out.println("transferência foi realizada com sucesso");
			System.out.println("Saldo final origem: " + contaOrigem.saldo);
			System.out.println("Saldo final destino: " + contaDestino.saldo);
			return true;
		}
		
		System.out.println("transferência não pode ser realizada");
		return false;
	}

}
