package ExemploFactoryMethod;


public class Monitor implements FabricaProdutoInformatica {
    @Override
    public String exibirInfo() {
        return "Modelo Monitor: Dell";
    }
}

