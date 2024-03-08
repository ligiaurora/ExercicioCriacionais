package ExemploFactoryMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/////////////////////////////////////////////////
	/*Produção de Itens de Informática*/
		
	FabricaProdutoInformatica fabricaM = new Monitor();
	System.out.println("Modelo de Item Fabricado: "+fabricaM.exibirInfo());
	
	///////////////////////////////////////////////
	/*Sons de Animais*/
	
    Animais cachorro = FabricaAnimais.criarAnimal("Cachorro");
    cachorro.fazerSom(); 
    
    Animais gato = FabricaAnimais.criarAnimal("Gato");
    gato.fazerSom();

	}

}
