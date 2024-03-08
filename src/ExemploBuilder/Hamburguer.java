package ExemploBuilder;

public class Hamburguer {
	 private String tipoPao;
	 private boolean carne;
	 private boolean hamburguerGraoBico;
	 private boolean queijo;
	 private boolean salada;
	 private boolean fritasAcomp;
	 
	 
	public String getTipoPao() {
		return tipoPao;
	}
	public void setTipoPao(String tipoPao) {
		this.tipoPao = tipoPao;
	}
	public boolean isCarne() {
		return carne;
	}
	public void setCarne(boolean carne) {
		this.carne = carne;
	}
	public boolean isHamburguerGraoBico() {
		return hamburguerGraoBico;
	}
	public void setHamburguerGraoBico(boolean hamburguerGraoBico) {
		this.hamburguerGraoBico = hamburguerGraoBico;
	}
	public boolean isQueijo() {
		return queijo;
	}
	public void setQueijo(boolean queijo) {
		this.queijo = queijo;
	}
	public boolean isSalada() {
		return salada;
	}
	public void setSalada(boolean salada) {
		this.salada = salada;
	}
	public boolean isFritasAcomp() {
		return fritasAcomp;
	}
	public void setFritasAcomp(boolean fritasAcomp) {
		this.fritasAcomp = fritasAcomp;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Hamburguer [tipo de Pão=");
		builder.append(tipoPao);
		builder.append(", carne=");
		builder.append(carne);
		builder.append(", hamburguer de Grao de Bico=");
		builder.append(hamburguerGraoBico);
		builder.append(", queijo=");
		builder.append(queijo);
		builder.append(", salada=");
		builder.append(salada);
		builder.append(", fritasAcomp=");
		builder.append(fritasAcomp);
		builder.append("]");
		return builder.toString();
	}
}
