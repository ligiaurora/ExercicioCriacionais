package ExemploFluenteInterface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		////////////////////////////////////////////////////////
		/*Configuração de Objetos com métodos*/
		ExemploFluentInterface ex = new ExemploFluentInterface()
                 .ativar()
                 .numero(10)
                 .texto("Exemplo de configuração com Fluent Interface");
		 System.out.println(ex);
		//////////////////////////////////////////////////////////
		 
		 /*Criação de  uma nota fiscal com chamadas de metodos*/
		 new NotaFiscal(1).paraCliente("Lígia")
         .qtItens(1, "Caneta")
         .qtItens(2, "Lápis")
         .gerarNf();
		 
		 
		 
		 
		 

	}

}
