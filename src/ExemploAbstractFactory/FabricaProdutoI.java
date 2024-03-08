package ExemploAbstractFactory;

public class FabricaProdutoI implements FabricaProdutos{
	 
	public Eletronico criarEletronico() {
		return new Celular();
	 }

	public Roupa criarRoupa() {
		return new Camisa();
	 }


}
