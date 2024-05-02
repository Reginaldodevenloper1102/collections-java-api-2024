package list.OperacoesBasicas.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    //atributo
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos(){
        this.estoqueProdutoMap = new HashMap<>();
    }

    public  void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutoMap.put(cod,new Produto(nome, preco, quantidade));

    }
    public void exibirProduto(){
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }

        return valorTotalEstoque;

    }

    public Produto obtereProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()){
            for (Produto p : estoqueProdutoMap.values()){
                if (p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
    }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProduto();

        estoque.adicionarProduto(1l,"produto A",10,5.0);
        estoque.adicionarProduto(2l,"produto B",5,10.0);
        estoque.adicionarProduto(3l,"produto C",2,15.0);

        estoque.exibirProduto();

        System.out.println("Valor de Estoque: R$ " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais Caro : R$ " + estoque.obtereProdutoMaisCaro());
    }
}


