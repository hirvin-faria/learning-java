
public class Cliente implements Autenticavel{

	private Autenticador autenticador;
	
	public Cliente() {
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
}
