package ExemploFactoryMethod;

public class Teclado implements FabricaProdutoInformatica {
    @Override
    public String exibirInfo() {
        return "Modelo Teclado: Razer Rosa";
    }
}
