import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pizza {
	private List<String> ingredientes;
	private static Map<String, Integer> contabilizacaoIngredientes = new HashMap<>();

	public Pizza() {
		this.ingredientes = new ArrayList<>();
	}

	public void adicionaIngredientes(String ingrediente) {
		ingredientes.add(ingrediente);
		contabilizaIngrediente(ingrediente);
	}

	public double getPreco() {
		int numIngredientes = ingredientes.size();
		if (numIngredientes <= 2) {
			return 15.0;
		} else if (numIngredientes <= 5) {
			return 20.0;
		} else {
			return 23.0;
		}
	}

	private static void contabilizaIngrediente(String ingrediente) {
		int quantidade = contabilizacaoIngredientes.getOrDefault(ingrediente, 0);
		contabilizacaoIngredientes.put(ingrediente, quantidade + 1);
	}

	public static Map<String, Integer> getContabilizacaoIngredientes() {
		return contabilizacaoIngredientes;
	}

	public boolean temIngredientes() {
		return !ingredientes.isEmpty();
	}

	public static void zeraRegistro() {
		contabilizacaoIngredientes = null;
	}

}