package ExemplosSingleton;

public class ConfiguracaoApp {
	
	private static ConfiguracaoApp SingleApp;
	
	private String nomeAplicativo;
	private String versaoApp;
	private String autor;
	
	
	public String getNomeAplicativo() {
		return nomeAplicativo;
	}
	public void setNomeAplicativo(String nomeAplicativo) {
		this.nomeAplicativo = nomeAplicativo;
	}
	public String getVersaoApp() {
		return versaoApp;
	}
	public void setVersaoApp(String versaoApp) {
		this.versaoApp = versaoApp;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	private ConfiguracaoApp() {
    	
    }
    
    
	public static ConfiguracaoApp getInstance() {
        if (SingleApp == null) {
        	SingleApp = new ConfiguracaoApp();
        }
        return SingleApp;
    }
	
	

}
