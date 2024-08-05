
public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha(10);

		p.empilhar("Cauã");
		p.empilhar("João");
		p.empilhar("Maria");
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		Object [] arrayElementos = p.getElementos();
		System.out.println(arrayElementos.length);
		arrayElementos[2] = "OUTRO";

		// desempilhando
		System.out.println("------------------------");
		System.out.println(p.desempilhar());
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		System.out.println(p.getElementos().length);
	}

}
