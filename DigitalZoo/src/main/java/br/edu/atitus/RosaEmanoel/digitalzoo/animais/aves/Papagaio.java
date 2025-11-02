package br.edu.atitus.RosaEmanoel.digitalzoo.animais.aves;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Ave;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Voador;

public class Papagaio extends Ave implements Voador {
    public Papagaio(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("Olá! Quero bolacha!"); }
    @Override public void comer() { System.out.println("Papagaio está descascando sementes."); }
    @Override public String getEspecie() { return "Papagaio"; }
    @Override public void voar() { System.out.println("Papagaio voa entre as árvores."); }
}
