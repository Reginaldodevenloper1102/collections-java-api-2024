package list.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    //atributo

    private Set<Covidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Covidado(nome , codigoConvite));

    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Covidado convidadoParaRemover = null;
        for (Covidado c : convidadoSet){
            if (c.getCodigoConvidado() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);

    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " Convidados dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado(" Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado(" Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado(" Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado(" Convidado 4", 1237);

        System.out.println("Existem "  +    conjuntoConvidados.contarConvidados() +  "Convidados dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite( 1237);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();



    }
}
