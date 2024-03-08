package ExemploBuilder;

public interface HamburguerI {
	Hamburguer burguer = new Hamburguer();
	
	public void tipoPao (String tipoPao);
	public void carne();
	public void hamburguerGraoBico();
	public void queijo();
	public void salada();
	public void fritasAcomp();
	
	public default Hamburguer build() {
		return burguer;
	}
}
