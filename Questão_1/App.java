package Questão_1;
public class App {
    public static void main(String[] args) {
        ListaContatos listaDeContatos = new ListaContatos();

        listaDeContatos.adicionarContato("Thiago", "123456789");
        listaDeContatos.adicionarContato("Luis", "987654321");
        listaDeContatos.adicionarContato("Assis", "5566778899");
        listaDeContatos.adicionarContato("Silva", "1122334455");

        System.out.println("Listando todos os contatos:");
        listaDeContatos.listarContatos();

        String nomeBusca = "Marcelo";
        Contato contatoEncontrado = listaDeContatos.buscarContato(nomeBusca);

        if (contatoEncontrado != null) {
            System.out.println("Contato encontrado: " + contatoEncontrado.getNome() + ", Telefone: " + contatoEncontrado.getTelefone());
        } else {
            System.out.println("Contato não encontrado: " + nomeBusca);
        }
    }
}