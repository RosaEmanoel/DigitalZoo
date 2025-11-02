package br.edu.atitus.RosaEmanoel.digitalzoo.animais.aves;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Ave;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Nadador;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Predador;

public class Pinguim extends Ave implements Nadador, Predador {
    public Pinguim(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("Honk honk!"); }
    @Override public void comer() { System.out.println("Pinguim come peixes e krill."); }
    @Override public String getEspecie() { return "Pinguim"; }
    @Override public void nadar() { System.out.println("Pinguim nada agilmente sob o gelo."); }
    @Override public void cacar() { System.out.println("Pinguim está caçando krill no gelo."); }
}
