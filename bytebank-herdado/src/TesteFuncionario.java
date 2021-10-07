
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Gerente();
		nico.setNome("Albert Wesker");
		nico.setCpf("123456789-101");
		nico.setSalario(2500.80);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
