package modulo_1;

//2. Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
public class Calculadora {	
	static int duplicaValor(int numero) {
		return numero*2;
	}
	
	public static void main(String[] args) {		
		int numero = 2;		
		System.out.println(Calculadora.duplicaValor(numero));		
	}

}
