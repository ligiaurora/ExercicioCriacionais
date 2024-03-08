package ExemploPrototype;

public class Main {

	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////
		/*Criação de novos objetos copiando um objeto existente*/
		PadraoPrototype pn = new PadraoPrototype("Aurora", "Oliveira");
		System.out.println(pn.getNome());
		
		
		System.out.println("--------------------");
		
		PadraoPrototype pn2 = (PadraoPrototype)pn.clone();
		System.out.println(pn2.getNome() + pn2.getSobrenome());
		//////////////////////////////////////////////////////////////
		
		 Cachorro cachorro1 = new Cachorro("Lara Bisteka", "Dachshund");
	        Cachorro cachorro2 = (Cachorro) cachorro1.clonarAnimal();
	        System.out.println("Cachorro 1: " + "" + cachorro1);
	        System.out.println("Cachorro 2: " + "" + cachorro2);

	        Gato gato1 = new Gato("Faisca", "Sphynx");
	        Gato gato2 = (Gato) gato1.clonarAnimal();
	        System.out.println("Gato 1: " + "" + gato1);
	        System.out.println("Gato 2: " + "" + gato2);
	}
}
