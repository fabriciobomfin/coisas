
package PetShop;

public class Pet {

    private String nome;
    private int idade;
    private String tipo; // Ex: Cachorro, Gato
    private Cliente dono;

    // Construtor
    public Pet(String nome, int idade, String tipo, Cliente dono) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        this.dono = dono;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    // Método toString
    @Override
    public String toString() {
        return "Pet [nome=" + nome + ", idade=" + idade + ", tipo=" + tipo + ", dono=" + dono.getNome() + "]";
    }
}

