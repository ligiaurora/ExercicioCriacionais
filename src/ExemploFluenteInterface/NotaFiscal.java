package ExemploFluenteInterface;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {
	
	private Integer numero;
    private List<Item> itens;
    private Cliente cliente;

    public NotaFiscal(Integer numero) {
        this.numero = numero;
        this.itens = new ArrayList<>();
    }

    public NotaFiscal qtItens(int quantidade, String nome) {
        itens.add(new Item(nome, quantidade));
        return this;
    }

    public NotaFiscal paraCliente(String nome) {
        cliente = new Cliente(nome);
        return this;
    }

    public void gerarNf() {
        System.out.println("Número da Nota Fiscal: " + numero);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Itens da Nota Fiscal:");
        for (Item item : itens) {
            System.out.println("- " + item.getQuantidade() + "x " + item.getNome());
        }
    }

}
