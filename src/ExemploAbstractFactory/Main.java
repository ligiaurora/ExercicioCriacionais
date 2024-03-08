package ExemploAbstractFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//////////////////////////////////////////////////////////////////////////////

		/*Mapear uma matriz de produtos distintos versus as variantes desses produto*/
		
		FabricaProdutos[][] matrizProdutos = {
		            {new FabricaProdutoI(), new FabricaProdutoII()},
		            {new FabricaProdutoI(), new FabricaProdutoII()},
		        };

		 for (FabricaProdutos[] linha : matrizProdutos) {
	            for (FabricaProdutos fabrica : linha) {
	                Eletronico eletronico = fabrica.criarEletronico();
	                Roupa roupa = fabrica.criarRoupa();
	           
	                eletronico.exibirInfo();
	                roupa.exibirInfo();
	                System.out.println(); 
	            }
	        }
		/////////////////////////////////////////////////////////////////////////////
		 /*Métodos para criar diferentes tipos de formas geométricas*/
		 
		 FabricaForma fabrica2D = new FabricaObjetos();
	        Forma circulo = fabrica2D.criarCirculo();
	        Forma retangulo = fabrica2D.criarRetangulo();

	        circulo.desenhar();
	        retangulo.desenhar();	 
	}

}
