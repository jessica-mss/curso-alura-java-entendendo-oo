package modulo_1;

public class CarroMain {
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.modelo = "Kicks";
		carro.cor = "Preto";
		carro.ano = 2022;
		
		carro.exibeFichaTecnica();
		System.out.println("A idade do carro é: " + carro.calculaIdadeCarro(2024) + " anos");
	}

}
