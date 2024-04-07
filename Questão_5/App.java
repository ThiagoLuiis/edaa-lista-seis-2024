package Questão_5;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

            List<Pessoa> pessoas = new ArrayList<>();
            pessoas.add(new Pessoa ("João", 25));
            pessoas.add(new Pessoa ("Maria", 30));
            pessoas.add(new Pessoa ("Pedro", 20));
            pessoas.add(new Pessoa ("Ana", 22));
            pessoas.add(new Pessoa ("Daniel", 31));
            pessoas.add(new Pessoa ("Lucas", 18));
    




            for (int i = 0; i < pessoas.size() - 1; i++) {
                for (int j = 0; j < pessoas.size() - 1 - i; j++) {
                    if (pessoas.get(j).getIdade() > pessoas.get(j + 1).getIdade()) {
                        Pessoa temp = pessoas.get(j);
                        pessoas.set(j, pessoas.get(j + 1));
                        pessoas.set(j + 1, temp);
                    }
                }
            }

                System.out.println("Lista de pessoas ordenada por idade:");
                for (Pessoa pessoa : pessoas) {
                System.out.println(pessoa.getNome() + ", " + pessoa.getIdade());
            }       
    }
}