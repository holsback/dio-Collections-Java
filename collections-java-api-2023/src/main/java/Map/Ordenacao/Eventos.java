package main.java.Map.Ordenacao;

public class Eventos {

    private String nome, atracao;

    public Eventos(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "nome: " + nome+
                ", atracao: " + atracao;
    }
}
