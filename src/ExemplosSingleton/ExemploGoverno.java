package ExemplosSingleton;

public class ExemploGoverno {
	
	
    private static ExemploGoverno SingleGoverno;

    private String nomePais;
    private String presidente;
    private int numeroMinistros;
  
    
    public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}


	public String getPresidente() {
		return presidente;
	}


	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}


	public int getNumeroMinistros() {
		return numeroMinistros;
	}


	public void setNumeroMinistros(int numeroMinistros) {
		this.numeroMinistros = numeroMinistros;
	}


	private ExemploGoverno() {
    	
    }
    
    
	public static ExemploGoverno getInstance() {
        if (SingleGoverno == null) {
        	SingleGoverno = new ExemploGoverno();
        }
        return SingleGoverno;
    }
}
