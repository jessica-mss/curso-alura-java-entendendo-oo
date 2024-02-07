package modulo_1;

//3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
public class Musica {
	private String titulo;
	private String artista;
	private int anoLancamento;
	private int avaliacao;
	public static int numAvaliacoes;
	
	void exibeFichaTecnica() {
		System.out.println("O nome da musica é: " + this.titulo);
		System.out.println("O artista é: " + this.artista);
		System.out.println("O ano de lançamento é: " + this.anoLancamento);
		System.out.println("A media de avaliações foi: " + this.avaliacao);
	}
	
	void avaliaMusica(int valorAvaliacao) {
		this.avaliacao += valorAvaliacao;
		numAvaliacoes += 1;
	}
	
	double calculaMediaAvaliações() {
		return this.avaliacao/numAvaliacoes;
	}	
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public int getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(int avaliacao) {
		this.avaliacao = avaliacao;
	}
	public int getNumAvaliacoes() {
		return numAvaliacoes;
	}
	public void setNumAvaliacoes(int numAvaliacoes) {
		this.numAvaliacoes = numAvaliacoes;
	}

}
