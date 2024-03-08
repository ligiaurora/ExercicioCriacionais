package ExemploPrototype;

class Cachorro implements AnimalClone{
	private String nome;
	private String raca;

    public Cachorro(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    @Override
    public AnimalClone clonarAnimal() {
        return new Cachorro(this.nome, this.raca);
    }

    @Override
    public String toString() {
        return "Cachorro: " + nome + "" + raca;
    }
}