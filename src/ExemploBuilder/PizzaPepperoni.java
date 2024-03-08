package ExemploBuilder;

public class PizzaPepperoni implements PizzaI {

	@Override
	public void tipo(String tipo) {
		pizza.setTipo("Média");
		
	}

	@Override
	public void queijo() {
		pizza.setQueijo(true);
		
	}

	@Override
	public void pepperoni() {
		pizza.setPepperoni(true);
		
	}

	@Override
	public void vegetais() {
		pizza.setVegetais(false);
		
	}

}
