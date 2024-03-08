package ExemploAbstractFactory;

public class Celular implements Eletronico {
	@Override
    public void exibirInfo() {
        System.out.println("Celular: Samsung Galaxy s24");
    }
}
