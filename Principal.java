import javax.swing.JOptionPane;

public class Principal {

	static final int QTEREGISTROS = 2;	
	public static String codigo[] = new String[QTEREGISTROS];
	public static String nome[] = new String[QTEREGISTROS];
	public static String email[] = new String[QTEREGISTROS];
	public static String cidade[] = new String[QTEREGISTROS];
	public static String uf[] = new String[QTEREGISTROS];
	public static JOptionPane entrada = new JOptionPane();

	public static void main(String[] args) {
		
		
		
		// escolha do usuario 
		String opcao = ""; 
		do { 
		opcao = entrada.showInputDialog("Informe sua opção:" +
				"\n1 - Cadastrar " +
				"\n2 - Consultar " +
				"\n3 - Atualizar " +
				"\n4 - Excluir" +
				"\n5 - Listar" +
				"\n6 - Sair"
				);
		
		if (opcao.equals("1")) { 		 CadastrarAluno(); 
		} else if (opcao.equals("2")) {  ConsultarAlunos();
		} else if (opcao.equals("3")) {  AtualizarAlunos();
		} else if (opcao.equals("4")) {  RemoverAlunos();
		} else if (opcao.equals("5")) {  ListarAlunos();
		} 
		} while (!opcao.equals("6")); // comparacao usando String 
		
		
	}

	
	
private static void CadastrarAluno() {
		int quantidade = QTEREGISTROS;
		for(int i=0; i < quantidade; i++){
			codigo[i] = entrada.showInputDialog("Código: Posicao Vetor " + (i+1) );
			nome[i] = entrada.showInputDialog("Nome: Posicao Vetor " + (i+1) );
			email[i] = entrada.showInputDialog("E-mail: Posicao Vetor " + (i+1) );
			cidade[i] = entrada.showInputDialog("Cidade: Posicao Vetor " + (i+1) );
			uf[i] = entrada.showInputDialog("UF2: Posicao Vetor " + (i+1) );
		}
			Mensagem ("Cadastrados com sucesso") ;
	}







public static void RemoverAlunos() {
	String valorBusca = entrada.showInputDialog("Nome Aluno para remover? ");
	int ix = 0;
	
	if( !codigo.equals("") ){
		String ListarTemporario = "Aluno encontrado: \n\n";
	for(int i = 0; i < codigo.length; i++ ){
		
		if( valorBusca.equals(nome[i])){
			
			codigo[i] = null;
			nome[i] = null;
			email[i] = null;
			cidade[i] = null;
			uf[i] = null;

		ix = 1;
		}
	}
	
	
	if(ix == 1 ) {
		entrada.showMessageDialog(null, "Removido");
	}else{
		entrada.showMessageDialog(null, "Nenhum encontrado");
	}
	
	}else{
		entrada.showMessageDialog(null, "Nenhum encontrado");	
	}
	
}




public static void AtualizarAlunos() {
	String valorBusca = entrada.showInputDialog("Nome Aluno? ");
	int ix = 0;
	
	if( !codigo.equals("") ){
		String ListarTemporario = "Aluno encontrado: \n\n";
	for(int i = 0; i < codigo.length; i++ ){
		
		if( valorBusca.equals(nome[i])){
			
			codigo[i] = entrada.showInputDialog("Novo Código: Posicao Vetor " + (i) );
			nome[i] = entrada.showInputDialog("Novo Nome: Posicao Vetor " + (i) );
			email[i] = entrada.showInputDialog("Novo E-mail: Posicao Vetor " + (i) );
			cidade[i] = entrada.showInputDialog("Novo Cidade: Posicao Vetor " + (i) );
			uf[i] = entrada.showInputDialog("Novo UF: Posicao Vetor " + (i) );
			
		//ListarTemporario += codigo[i] + " - " + nome[i] + " - " + email[i] + " - " + cidade[i] + " - " + uf[i] + "\n ============================= \n\n";
		ix = 1;
		}
	}
	
	
	if(ix == 1 ) {
		entrada.showMessageDialog(null, "Atualizado");
	}else{
		entrada.showMessageDialog(null, "Nenhum encontrado");
	}
	
	}else{
		entrada.showMessageDialog(null, "Nenhum encontrado");	
	}
	
}





public static void ConsultarAlunos() {
	String valorBusca = entrada.showInputDialog("Nome Aluno? ");
	int ix = 0;
	
	if( !codigo.equals("") ){
		String ListarTemporario = "Aluno encontrado: \n\n";
	for(int i = 0; i < codigo.length; i++ ){
		
		if( valorBusca.equals(nome[i])){
		ListarTemporario += codigo[i] + " - " + nome[i] + " - " + email[i] + " - " + cidade[i] + " - " + uf[i] + "\n ============================= \n\n";
		ix = 1;
		}
	}
	
	
	if(ix == 1 ) {
		entrada.showMessageDialog(null, ListarTemporario);
	}else{
		entrada.showMessageDialog(null, "Nenhum encontrado");
	}
	
	}else{
		entrada.showMessageDialog(null, "Nenhum encontrado");	
	}
	
}


	public static void ListarAlunos() {
		
		if( !codigo.equals("") ){
			String ListarTemporario = "Lista de Alunos \n\n";
		for(int i = 0; i < codigo.length; i++ ){
			ListarTemporario += codigo[i] + " - " + nome[i] + " - " + email[i] + " - " + cidade[i] + " - " + uf[i] + "\n ============================= \n\n";	
		}
		entrada.showMessageDialog(null, ListarTemporario);
		}else{
			entrada.showMessageDialog(null, "Nenhum encontrado");	
		}
		
}
	

	
	public static void Mensagem(String texto) {
		JOptionPane.showMessageDialog(null, texto);
				
	}
}
