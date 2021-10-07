
public class Administrador extends Funcionario implements Autenticavel {
	
	private Autenticador autenticador;
	
	public Administrador() {
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
	
	@Override
	public double getBonificacao() {
		return 50;
	}

}
