package list.OperacoesBasicas;

import java.util.Objects;

public class Covidado {
    //atributos

    private String nome;

    private int codigoConvidado;

    public Covidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvidado = codigoConvidado;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvidado() {
        return codigoConvidado;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Covidado covidado)) return false;
        return getCodigoConvidado() == covidado.getCodigoConvidado();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvidado());
    }

    @Override
    public String toString() {
        return "Covidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvidado=" + codigoConvidado +
                '}';
    }
}
