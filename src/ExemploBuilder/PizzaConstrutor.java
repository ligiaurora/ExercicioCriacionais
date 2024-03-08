package ExemploBuilder;

public class PizzaConstrutor {
	protected PizzaI constru;
	
	
	public PizzaConstrutor(PizzaI pizzacons) {
		this.constru = pizzacons;	
	}
	
	
	public void fazendoPizza(String tipo) {
		constru.queijo();
		constru.pepperoni();
		constru.vegetais();
		constru.tipo(tipo);
	}
	
	public Pizza getPizza() {
		return constru.build();
	}
}
