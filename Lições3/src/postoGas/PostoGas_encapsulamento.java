package postoGas;

public class PostoGas_encapsulamento {
	private int litros = 0;
	private int descAlcool[] = { 3, 5 }, descGas[] = { 4, 6 };
	private String tipoCombustivel = "", mensagem = "";
	private double vlrPago = 0;

	public void setInfo(int lts, String tpC) {
		this.litros = lts;
		this.tipoCombustivel = tpC;
	}

	private String calcularVlrPago() {
		if (litros <= 20 && tipoCombustivel.equalsIgnoreCase("a")) {
			vlrPago = litros * 3.30 - (litros * 3) / 100;
		} else if (litros > 20 && tipoCombustivel.equalsIgnoreCase("a")) {
			vlrPago = litros * 3.30 - (litros * 5) / 100;
		} else if (litros <= 20 && tipoCombustivel.equalsIgnoreCase("g")) {
			vlrPago = litros * 2.90 - (litros * 4) / 100;
		} else if (litros > 20 && tipoCombustivel.equalsIgnoreCase("g")) {
			vlrPago = litros * 2.90 - (litros * 6) / 100;
		}
		return mensagem = "Valor a ser pago : " + vlrPago;
	}

	public String getVlrPago() {
		return calcularVlrPago();
	}
}
