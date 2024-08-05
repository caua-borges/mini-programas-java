package formatacaoNome;

public class Respeitoso implements FormatadorNome{
	private boolean masculino;

	public Respeitoso(boolean masculino) {
		this.masculino = masculino;
	}
	
	@Override
	public String formatarNome(String nome, String sobreNome) {
		return (masculino ? "Sr." : "Sra.") + " " + sobreNome;
	}
}
