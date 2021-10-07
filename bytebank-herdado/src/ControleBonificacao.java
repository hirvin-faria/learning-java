
public class ControleBonificacao {

	private double somaBonificacao;
	
	public void registra(Funcionario funcionario) {
		double bonificacao = funcionario.getBonificacao();
		this.somaBonificacao = this.somaBonificacao + bonificacao;
	}
	
	public double getSomaBonificacao() {
		return somaBonificacao;
	}

}
