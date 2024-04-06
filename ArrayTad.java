import java.util.Arrays;

public class ArrayTad implements InterfaceTad{
    
    private Contato[] contatos;
    private int tamanho;

    @Override
    public String toString() {
        return "ArrayTad [contatos=" + Arrays.toString(contatos) + ", tamanho=" + tamanho + "]";
    }

    public ArrayTad(int capacidade){
        contatos = new Contato[capacidade];
        tamanho = 0;
    }


    @Override
    public void adicionar(Contato contato) {
        if (tamanho < contatos.length) {
            contatos[tamanho++] = contato;
        } else {
            System.out.println("Lista cheia.");
        }
    }

    @Override
    public void remover(int indice) {
        if(indice >= 0 && indice < tamanho){
            for(int i= indice; i <tamanho - 1 ; i++){
                contatos[i] = contatos[i+1];
            }
            tamanho++;
        }
        else{
            System.out.println("Indice Invalido");
        }
    }

    @Override
    public Contato obter(String nome) {
        
        for(int indice = 0; indice < contatos.length; indice++){
            boolean igual = contatos[indice].getNome() == nome;
            
            if(igual){
                return contatos[indice];
            }
            

        }

        return new Contato("String");

    }

    @Override
    public int tamanho() {
       return tamanho;
    }
}