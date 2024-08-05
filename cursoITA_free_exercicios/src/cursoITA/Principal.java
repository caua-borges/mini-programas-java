package cursoITA;

public class Principal {

	public static void main(String[] args) {
		Corrida corridaDaAmizade = new Corrida(2000);
		corridaDaAmizade.adicionaCarroNaCorrida(new CarroSoma(10, "Corcel", 110));
		corridaDaAmizade.adicionaCarroNaCorrida(new CarroSoma(8, "Del rey", 140));
		corridaDaAmizade.adicionaCarroNaCorrida(new CarroMult("Mustang", 1.7, 100));
		corridaDaAmizade.adicionaCarroNaCorrida(new CarroMult("Fusca", 1.4, 110));

		corridaDaAmizade.umDoisTresEJa();
	}

}
