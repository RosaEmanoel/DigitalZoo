package br.edu.atitus.RosaEmanoel.digitalzoo.animais.aves;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Ave;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Voador;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Predador;

public class Aguia extends Ave implements Voador, Predador {
    public Aguia(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("Kreee!"); }
    @Override public void comer() { System.out.println("Águia está dilacerando a presa."); }
    @Override public String getEspecie() { return "Águia"; }
    @Override public void voar() { System.out.println("Águia voa em círculos nas correntes de ar."); }
    @Override public void cacar() { System.out.println("Águia mergulha para caçar um peixe."); }
}
