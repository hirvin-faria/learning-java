
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	// Reescrita do metodo getBonificacao da classe mae Funcionario
	public double getBonificacao() {
		// super faz refrencia a classe mae Funcionario
		System.out.println("gera bonificacao gerente");
		return super.getBonificacao() + super.getSalario();
	}
	 
}
