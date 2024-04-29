package list.OperacoesBasicas.ordenacao;

import java.util.ArrayList;
import java.util.List;

public class CatalagosLivros {
    //atributo
    private List<Livro> livroList;

    public CatalagosLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }


        }
        return livrosPorAutor;


    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }

            }

        }
        return livrosPorIntervaloAnos;

    }public  Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()){
            for(Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l ;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagosLivros catalagosLivros= new CatalagosLivros();
        catalagosLivros.adicionarLivro("Livro 1","Autor 1", 2021);
        catalagosLivros.adicionarLivro("Livro 1","Autor 2", 2021);
        catalagosLivros.adicionarLivro("Livro 2","Autor 2", 2022);
        catalagosLivros.adicionarLivro("Livro 3","Autor 3", 2023);
        catalagosLivros.adicionarLivro("Livro 4","Autor 4", 1994);

        System.out.println(catalagosLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalagosLivros.pesquisarPorIntervaloAnos(2020,2021));
        System.out.println(catalagosLivros.pesquisarPorTitulo("Livro 1"));


    }
}
