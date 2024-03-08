package ExemploBuilder;

public class HamburguerPremium implements HamburguerI {

	@Override
	public void tipoPao(String tipoPao) {
		burguer.setTipoPao("Australiano");
		
	}

	@Override
	public void carne() {
		burguer.setCarne(true);
		
	}

	@Override
	public void hamburguerGraoBico() {
		burguer.setHamburguerGraoBico(false);
		
	}

	@Override
	public void queijo() {
		burguer.setQueijo(true);		
	}

	@Override
	public void salada() {
		burguer.setSalada(true);
		
	}

	@Override
	public void fritasAcomp() {
		burguer.setFritasAcomp(true);
		
	}

}
