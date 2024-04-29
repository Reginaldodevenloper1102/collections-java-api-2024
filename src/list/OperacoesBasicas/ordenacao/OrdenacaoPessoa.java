package list.OperacoesBasicas.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoas> pessoasList;

    public OrdenacaoPessoa(){
        this.pessoasList = new ArrayList<>();

    }
    public void adicionaPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoas(nome, idade, altura));
    }

    public List<Pessoas> ordenadaPorIdade(){
        List<Pessoas> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;

    }

    public List<Pessoas> ordenarPorAltura() {
        List<Pessoas> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;


    }

    public static void main(String [] args){
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionaPessoa("Nome 1",20, 1.56);
        ordenacaoPessoa.adicionaPessoa("Nome 2",30, 1.80);
        ordenacaoPessoa.adicionaPessoa("Nome 3",25, 1.70);
        ordenacaoPessoa.adicionaPessoa("Nome 4",17, 1.56);

        System.out.println(ordenacaoPessoa.ordenadaPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.pessoasList);


    }


}
