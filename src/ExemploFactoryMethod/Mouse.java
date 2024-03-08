package ExemploFactoryMethod;

public class Mouse implements FabricaProdutoInformatica {
    @Override
    public String exibirInfo() {
        return "Modelo Mouse: Logitech";
    }
}

