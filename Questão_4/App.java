package Questão_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
    List<Pais> listaPaíses = new ArrayList<>();
        listaPaíses.add(new Pais("Brasil"));
        listaPaíses.add(new Pais ("Argentina"));
        listaPaíses.add(new Pais ("Chile"));
        listaPaíses.add(new Pais ("Uruguai"));
        listaPaíses.add(new Pais ("Portugal"));
        listaPaíses.add(new Pais ("Bolívia"));
        listaPaíses.add(new Pais("China"));
        listaPaíses.add(new Pais ("Estados Unidos"));
        listaPaíses.add(new Pais ("França"));
        listaPaíses.add(new Pais ("Japão"));
        listaPaíses.add(new Pais ("Coréia"));

         Collections.sort(listaPaíses, (pais1, pais) -> pais1.getNome().compareToIgnoreCase(pais.getNome()));


        System.out.println("Lista dos paises ordenada:");
        for (Pais animal : listaPaíses) {
            System.out.println(animal.getNome());
        }

    }
}