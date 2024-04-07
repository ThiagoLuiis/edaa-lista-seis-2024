package Questão_2;
public class App {
    public static void main(String[] args) {
        ListaCompras lista = new ListaCompras();

        //exibir Lista Vazia
        lista.exibirLista();

        //Adicionando itens na lista
        lista.adicionarItem("Biscoito");
        lista.adicionarItem("Refrigerante");
        lista.adicionarItem("Bolo");
        lista.adicionarItem("Manteiga");
        lista.adicionarItem("Pão");
        lista.adicionarItem("Sorvete");

        //Mostrar Lista com itens
        lista.exibirLista();

        //removendo da lista
        lista.removerItem("Bolo");

        lista.exibirLista();
    }
}