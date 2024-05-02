package list.OperacoesBasicas.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    //atributo

    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarCotato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPornome(String nome){
        Set<Contato> contatospornome =new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatospornome.add(c);
            }
        }
        return contatospornome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtulizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtulizado = c;
                break;
            }
        }
        return contatoAtulizado;

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();



        agendaContatos.adicionarCotato("Camila", 123456);
        agendaContatos.adicionarCotato("Camila", 343430);
        agendaContatos.adicionarCotato("Camila Cavalcante", 11111111);
        agendaContatos.adicionarCotato("Camila DIO", 457987);
        agendaContatos.adicionarCotato("Maria Silva", 23456545);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPornome("Camila"));

        System.out.println("Contato Atulaizado" + agendaContatos.atualizarNumeroContato("Maria Silva", 55555555));

        agendaContatos.exibirContato();
    }

}
