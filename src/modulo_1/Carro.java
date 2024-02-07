package modulo_1;

//4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
public class Carro {
	String modelo;
	int ano;
	String cor;
	
	
	int calculaIdadeCarro(int anoAtual) {
		int idadeCarro = anoAtual - this.ano;
		return idadeCarro;
	}

	void exibeFichaTecnica() {
		System.out.println("modelo: " + modelo);
		System.out.println("ano: " + ano);
		System.out.println("cor: " + cor);
	}
}
