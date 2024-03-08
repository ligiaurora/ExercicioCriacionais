package ExemploBuilder;

public class Pizza {
	 private String tipo;
	 private boolean queijo;
	 private boolean pepperoni;
	 private boolean vegetais;
	 
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isQueijo() {
		return queijo;
	}
	public void setQueijo(boolean queijo) {
		this.queijo = queijo;
	}
	public boolean isPepperoni() {
		return pepperoni;
	}
	public void setPepperoni(boolean pepperoni) {
		this.pepperoni = pepperoni;
	}
	public boolean isVegetais() {
		return vegetais;
	}
	public void setVegetais(boolean vegetais) {
		this.vegetais = vegetais;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pizza [tipo=");
		builder.append(tipo);
		builder.append(", queijo=");
		builder.append(queijo);
		builder.append(", pepperoni=");
		builder.append(pepperoni);
		builder.append(", vegetais=");
		builder.append(vegetais);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
