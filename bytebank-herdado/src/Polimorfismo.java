
public class Polimorfismo {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setNome("Marcelo");
		gerente.setSalario(5000);

//		Classe abstrata impede a instanciacao do tipo abstrato funcionario
//		Funcionario funcionario1 = new Funcionario();
//		funcionario1.setSalario(2000);
		
		EditorVideo editorVideo = new EditorVideo();
		editorVideo.setSalario(2500);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(gerente);
//		controle.registra(funcionario1);
		controle.registra(editorVideo);
		
		System.out.println(controle.getSomaBonificacao());
	}
}
