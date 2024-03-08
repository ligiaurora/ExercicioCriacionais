package ExemploAbstractFactory;

public class FabricaProdutoII implements FabricaProdutos {
	public Eletronico criarEletronico() {
		return new Televisao();
	 }

	public Roupa criarRoupa() {
		return new Vestido();
	 }


}
