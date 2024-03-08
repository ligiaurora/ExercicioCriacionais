package ExemploPrototype;

public class Gato implements AnimalClone{
	private String nome;
	private String raca;

	public Gato(String nome, String raca) {
		this.nome = nome;
		this.raca = raca;
	}

	@Override
	public AnimalClone clonarAnimal() {
		return new Gato(this.nome, this.raca);
	}

	@Override
	public String toString() {
		return "Gato: " + nome + "" + raca;
	}

}
