package ExemploFactoryMethod;

public class FabricaAnimais {

	
    public static Animais criarAnimal(String tipo) {
        if (tipo.equalsIgnoreCase("Cachorro")) {
            return new Cachorro();
        } else if (tipo.equalsIgnoreCase("Gato")) {
            return new Gato();
        } else {
            return null;
        }
    }
}
