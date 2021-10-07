
public class Gerente extends Funcionario implements Autenticavel {

	private Autenticador autenticador;
	
	public Gerente() {
		// Composicao - promove reutilizacao de codigo
		this.autenticador = new Autenticador();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	// Reescrita do metodo getBonificacao da classe mae Funcionario
	public double getBonificacao() {
		// super faz refrencia a classe mae Funcionario
		System.out.println("gera bonificacao gerente");
		return super.getBonificacao() + super.getSalario();
	}
	 
}
