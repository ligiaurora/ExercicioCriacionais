package ExemplosSingleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		////////////////////////////////////////////////////////////////////////
		/*Exemplo Singleton Governo
		 * 
		 *  Um país pode ter apenas um governo oficial. Independentemente das identidades pessoais
		 *  dos indivíduos que formam governos.
		 * */
		
		ExemploGoverno g1 = ExemploGoverno.getInstance();
		g1.setNomePais("Teste Pais");
		g1.setPresidente("Teste");
		g1.setNumeroMinistros(50);
		
		System.out.println("Nome do país: " + g1.getNomePais());
	    System.out.println("Líder do governo: " + g1.getPresidente());
	    System.out.println("Número de ministros: " + g1.getNumeroMinistros());
	    
	    ///////////////////////////////////////////////////////////////////////
	    /*Exemplo Singleton Configuração de Aplicativo
	     * 
	     * Na configuração do aplicativo algumas configurações devem ser acessíveis de forma global
         * mas não devem ser instanciadas mais de uma vez durante a execução do programa. 
	     * */
	    
	    
	    ConfiguracaoApp app1 = ConfiguracaoApp .getInstance();
	    app1.setNomeAplicativo("Aplicativo de Teste");
	    app1.setVersaoApp("Versão 2.1");
	    app1.setAutor("Autor de Teste");
	    
		
		System.out.println("Nome do país: " + app1.getNomeAplicativo());
	    System.out.println("Líder do governo: " + app1.getVersaoApp());
	    System.out.println("Número de ministros: " + app1.getAutor());
	}
}
