package JoaoSalario;

public class joaoSalario_encapsulamento {
	private double salarioJoao = 1200, conta1 = 200, conta2 = 120;

	private double calcularFinanca() {
		conta1 = conta1 + (conta1 * 2) / 100;
		conta2 = conta2 + (conta2 * 2) / 100;
		salarioJoao = salarioJoao - (conta1 + conta2);
		return salarioJoao;
	}
	public double getSalario() {
		calcularFinanca();
		return salarioJoao;
	}
}
