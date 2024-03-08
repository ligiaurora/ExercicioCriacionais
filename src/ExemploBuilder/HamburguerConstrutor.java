package ExemploBuilder;

public class HamburguerConstrutor {
protected HamburguerI construH;
	
	
	public HamburguerConstrutor(HamburguerI burguercons) {
		this.construH = burguercons;	
	}
	
	
	public void fazendoBurguer(String tipoPao) {
		construH.queijo();
		construH.salada();
		construH.carne();
		construH.tipoPao(tipoPao);
		construH.hamburguerGraoBico();
		construH.fritasAcomp();
	}
	
	public Hamburguer getHamburguer() {
		return construH.build();
	}

}
