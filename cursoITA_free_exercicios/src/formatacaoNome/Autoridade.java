package formatacaoNome;

public class Autoridade {
	private String nome;
	private String sobreNome;
	private FormatadorNome formatador;

	public Autoridade(String nome, String sobreNome, FormatadorNome formatador) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.formatador = formatador;
	}

	public String getTratamento() {
		return formatador.formatarNome(nome, sobreNome);
	}
}