package formatacaoNome;

public class ComTitulo implements FormatadorNome {
	private String titulo;

	public ComTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String formatarNome(String nome, String sobreNome) {
		return titulo + " " + nome + " " + sobreNome;
	}
}
