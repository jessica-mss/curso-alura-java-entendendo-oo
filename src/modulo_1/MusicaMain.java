package modulo_1;

public class MusicaMain {
	
	public static void main(String[] args) {
		Musica musica1 = new Musica();
		musica1.setTitulo("Maliciosa");
		musica1.setArtista("Ludmilla");
		musica1.setAnoLancamento(2024);
		musica1.avaliaMusica(10);
		musica1.avaliaMusica(2);
		musica1.calculaMediaAvaliações();		
		musica1.exibeFichaTecnica();
	
	}

}
