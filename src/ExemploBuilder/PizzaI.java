package ExemploBuilder;

public interface PizzaI {
	Pizza pizza = new Pizza();
	
	public void tipo (String tipo);
	public void queijo();
	public void pepperoni();
	public void vegetais();
	
	public default Pizza build() {
		return pizza;
	}
}
