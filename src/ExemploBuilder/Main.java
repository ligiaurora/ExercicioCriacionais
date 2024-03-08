package ExemploBuilder;

public class Main {

	public static void main(String[] args) {
	
	////////////////////////////////////////////////
	/*Produção de Pizza*/	
	
		
	PizzaConstrutor pizzaVeg = new PizzaConstrutor(new PizzaVegetariana());
	pizzaVeg.fazendoPizza("Grande");
	Pizza pv = pizzaVeg.getPizza();
	System.out.println("Informações da Pizza Vegetariana:"+ pv);
		
	///////////////////////////////////////////////
	/*Produção de Hamburguer*/	
		
	HamburguerConstrutor burguerVeg = new HamburguerConstrutor(new HamburguerVegetariano());	
	burguerVeg.fazendoBurguer("Pão de Cenoura");
	Hamburguer hv = burguerVeg.getHamburguer();
	System.out.println("Informações do Hamburguer Vegetariano: " + hv);
		
		
	//////////////////////////////////////////////

	}

}
