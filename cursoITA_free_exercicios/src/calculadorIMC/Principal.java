package calculadorIMC;

public class Principal {
	public static void main(String args[]) {
		Paciente paciente = new Paciente(50, 1.74);
		System.out.println(paciente.diagnostico());

		Paciente paciente2 = new Paciente(70, 1.76);
		System.out.println(paciente2.diagnostico());
		
		Paciente paciente3 = new Paciente(120,1.90);
		System.out.println(paciente3.diagnostico());
	}
}