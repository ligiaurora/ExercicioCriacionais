package ExemploBuilder;

public class PizzaQueijo implements PizzaI {

	@Override
	public void tipo(String tipo) {
		pizza.setTipo("Grande");
		
	}

	@Override
	public void queijo() {
		pizza.setQueijo(true);
		
	}

	@Override
	public void pepperoni() {
		pizza.setPepperoni(false);
		
	}

	@Override
	public void vegetais() {
		pizza.setVegetais(false);
		
	}

}
