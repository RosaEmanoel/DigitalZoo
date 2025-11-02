package br.edu.atitus.RosaEmanoel.digitalzoo.animais.repteis;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Reptil;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Nadador;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Predador;

public class Jacare extends Reptil implements Nadador, Predador {
    public Jacare(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("Grrrr!"); }
    @Override public void comer() { System.out.println("Jacaré tritura a presa com mordida poderosa."); }
    @Override public String getEspecie() { return "Jacaré"; }
    @Override public void nadar() { System.out.println("Jacaré desliza silenciosamente pelos mangues."); }
    @Override public void cacar() { System.out.println("Jacaré embosca presas na beira d'água."); }
}
