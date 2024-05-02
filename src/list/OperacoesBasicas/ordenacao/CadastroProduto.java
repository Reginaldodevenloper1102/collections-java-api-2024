package list.OperacoesBasicas.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //atributos

    private Set<Produto> produtoSet;

    public CadastroProduto(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco(){
        Set<Produto> produtosPorPreco= new TreeSet<>(new CompatatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();
        cadastroProduto.adicionarProduto(1l,"Produto 5",156,5);
        cadastroProduto.adicionarProduto(2l,"Produto 9",20,5);
        cadastroProduto.adicionarProduto(3l,"Produto 3",10,5);
        cadastroProduto.adicionarProduto(4l,"Produto 1",26,5);

        System.out.println(cadastroProduto.exibirProdutoPorNome());
        System.out.println(cadastroProduto.exibirProdutoPorPreco());
        System.out.println(cadastroProduto.produtoSet);

    }


}
