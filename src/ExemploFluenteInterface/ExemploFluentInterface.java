package ExemploFluenteInterface;

public class ExemploFluentInterface {
	private boolean ativo;
    private int numero;
    private String texto;
    
    
    public ExemploFluentInterface () {
        this.ativo = false;
        this.numero = 0;
        this.texto = "";
    }

    public ExemploFluentInterface ativar() {
        this.ativo = true;
        return this;
    }

    public ExemploFluentInterface numero(int numero) {
        this.numero = numero;
        return this;
    }

    public ExemploFluentInterface texto(String texto) {
        this.texto = texto;
        return this;
    }

    @Override
    public String toString() {
        return "Arranjo: Ativo=" + ativo + ", Número=" + numero + ", Texto='" + texto + "'";
    }

}
