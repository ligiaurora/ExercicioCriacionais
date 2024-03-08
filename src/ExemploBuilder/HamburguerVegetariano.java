package ExemploBuilder;

public class HamburguerVegetariano implements HamburguerI {

	@Override
	public void tipoPao(String tipoPao) {
		burguer.setTipoPao("Hamburguer de Cenoura");
		
	}

	@Override
	public void carne() {
		burguer.setCarne(false);
		
	}

	@Override
	public void hamburguerGraoBico() {
		burguer.setHamburguerGraoBico(true);
		
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
