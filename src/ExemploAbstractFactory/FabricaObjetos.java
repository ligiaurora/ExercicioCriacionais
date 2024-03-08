package ExemploAbstractFactory;

public class FabricaObjetos implements FabricaForma {
	 @Override
	    public Forma criarCirculo() {
	        return new Circulo();
	    }

	    @Override
	    public Forma criarRetangulo() {
	        return new Retangulo();
	    }

}
