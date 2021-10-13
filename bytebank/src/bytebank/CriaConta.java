package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.nome = "Ana";
		
		primeiraConta.deposita(300);
		System.out.println(primeiraConta.saldo);
		System.out.println(primeiraConta.getNome());
	}
}
