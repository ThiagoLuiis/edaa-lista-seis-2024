public class App {
    public static void main(String[] args) throws Exception {
        InterfaceTad lista = new ArrayTad(5);
        Contato thiago = new Contato("Thiago");
        Contato numero = new Numero();
        lista.adicionar(thiago);
        System.out.println(lista);


    }
}
