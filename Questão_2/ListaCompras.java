package Questão_2;
import java.util.ArrayList;

class ListaCompras {
    private ArrayList<ItemCompra> itensCompra;

    public ListaCompras() {
        itensCompra = new ArrayList<>();
    }

    public void adicionarItem(String nomeItem) {
        ItemCompra novoItem = new ItemCompra(nomeItem);
        itensCompra.add(novoItem);
    }

    public void removerItem(String nomeItem) {
        for (int i = 0; i < itensCompra.size(); i++) {
            if (itensCompra.get(i).getNome().equals(nomeItem)) {
                itensCompra.remove(i);
                System.out.println("\nRemovendo " + nomeItem + " da lista de compras.");
                return;
            }
        }
        System.out.println(nomeItem + " não encontrado na lista de compras.");
    }

    public void exibirLista() {
        if (itensCompra.isEmpty()) {
            System.out.println("A lista de compras está vazia.");
        } else {
            System.out.println("\nLista de Compras:");
            for (ItemCompra item : itensCompra) {
                System.out.println("- " + item.getNome());
            }
        }
    }
}