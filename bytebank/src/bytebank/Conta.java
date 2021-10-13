package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String nome;
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	String getNome() {
		return this.nome;
	}
}
