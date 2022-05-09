package Filha;

public abstract class Filhas implements Comparable<Filhas> {
    protected String nome;
    protected double idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    protected Filhas(String nome, double idade){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Filhas o) {

        return Double.compare(this.idade, o.getIdade());

    }
}
