package ExemploBuilder;

public class PizzaVegetariana implements PizzaI {

	@Override
	public void tipo(String tipo) {
		pizza.setTipo("Familia");
		
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
		pizza.setVegetais(true);
		
	}

}
