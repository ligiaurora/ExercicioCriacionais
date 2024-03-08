package ExemploPrototype;

public class PadraoPrototype implements Cloneable {
	private String nome;
	private String sobrenome;
	
	public PadraoPrototype(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	protected Object clone() {
		PadraoPrototype pp = null;
		try {
			pp = (PadraoPrototype)super.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
			return pp;		
	}
}
