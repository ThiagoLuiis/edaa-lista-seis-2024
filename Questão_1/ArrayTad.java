package Questão_1;
import java.util.ArrayList;
import java.util.List;

class ListaContatos {
    private ArrayList<Contato> contatos;

    public ListaContatos() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        Contato novoContato = new Contato(nome, telefone);
        contatos.add(novoContato);
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("A lista de contatos vazia.");
        } else {
            System.out.println("Lista de Contatos:");
            for (Contato contato : contatos) {
                System.out.println("Nome do contato: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
            }
        }
    }
}