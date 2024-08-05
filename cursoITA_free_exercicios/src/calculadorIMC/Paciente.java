package calculadorIMC;

public class Paciente {
	double peso = 0;
	double altura = 0;
	double IMC = 0;

	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public void calcularIMC() {
		this.IMC = peso / (altura * altura);
	}

	public String diagnostico() {
		calcularIMC();
		String mensagem = "";

		if (IMC < 16) {
			mensagem = "Baixo peso muito grave";
		} else if (IMC > 16 && IMC < 16.99) {
			mensagem = "Baixo peso grave";
		} else if (IMC > 17 && IMC < 18.49) {
			mensagem = "Baixo peso";
		} else if (IMC > 18.50 && IMC < 24.99) {
			mensagem = "Peso normal";
		} else if (IMC > 25 && IMC < 29.99) {
			mensagem = "Sobrepeso";
		} else if (IMC > 30 && IMC < 34.99) {
			mensagem = "Obesidade grau I";
		} else if (IMC > 35 && IMC < 39.99) {
			mensagem = "Obesidade grau II";
		} else if (IMC >= 40) {
			mensagem = "Obesidade grau III (Obesidade mórbida)";
		}
		return mensagem;
	}

}
