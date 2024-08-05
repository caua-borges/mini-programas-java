package PessoaNascimento;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {

	// variáveis
	private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	private String dataNascimento = "";
	private LocalDate dataNascimentoF;

	public Pessoa(String dataNascimento) {
		this.dataNascimento = dataNascimento;
		this.dataNascimentoF = LocalDate.parse(dataNascimento, formato);
	}

	public void setDataDeNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
		this.dataNascimentoF = LocalDate.parse(dataNascimento, formato);
	}

	public int getIdade() {
		LocalDate hoje = LocalDate.now();
		Period idade = Period.between(dataNascimentoF, hoje);
		return idade.getYears();
	}

	public String getSigno() {
		String mensagem = "";
		int diaNascimento = dataNascimentoF.getDayOfMonth();
		int mesNascimento = dataNascimentoF.getMonthValue();

		if ((mesNascimento == 12 && diaNascimento >= 22) || (mesNascimento == 1 && diaNascimento <= 20)) {
			mensagem = "Capricórnio";
		}
		if ((mesNascimento == 1 && diaNascimento >= 21) || (mesNascimento == 2 && diaNascimento <= 19)) {
			mensagem = "Aquário";
		}
		if ((mesNascimento == 2 && diaNascimento >= 20) || (mesNascimento == 3 && diaNascimento <= 20)) {
			mensagem = "Peixes";
		}
		if ((mesNascimento == 3 && diaNascimento >= 21) || (mesNascimento == 4 && diaNascimento <= 20)) {
			mensagem = "Áries";
		}
		if ((mesNascimento == 4 && diaNascimento >= 21) || (mesNascimento == 5 && diaNascimento <= 20)) {
			mensagem = "Touro";
		}
		if ((mesNascimento == 5 && diaNascimento >= 21) || (mesNascimento == 6 && diaNascimento <= 20)) {
			mensagem = "Gêmeos";
		}
		if ((mesNascimento == 6 && diaNascimento >= 21) || (mesNascimento == 7 && diaNascimento <= 21)) {
			mensagem = "Câncer";
		}
		if ((mesNascimento == 7 && diaNascimento >= 22) || (mesNascimento == 8 && diaNascimento <= 22)) {
			mensagem = "Leão";
		}
		if ((mesNascimento == 8 && diaNascimento >= 23) || (mesNascimento == 9 && diaNascimento <= 22)) {
			mensagem = "Virgem";
		}
		if ((mesNascimento == 9 && diaNascimento >= 23) || (mesNascimento == 10 && diaNascimento <= 22)) {
			mensagem = "Libra";
		}
		if ((mesNascimento == 10 && diaNascimento >= 23) || (mesNascimento == 11 && diaNascimento <= 21)) {
			mensagem = "Escorpião";
		}
		if ((mesNascimento == 11 && diaNascimento >= 22) || (mesNascimento == 12 && diaNascimento <= 21)) {
			mensagem = "Capricórnio";
		}
		return mensagem;
	}
}