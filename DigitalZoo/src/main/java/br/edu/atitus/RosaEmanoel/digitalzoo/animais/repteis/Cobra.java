package br.edu.atitus.RosaEmanoel.digitalzoo.animais.repteis;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Reptil;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Predador;

public class Cobra extends Reptil implements Predador {
    public Cobra(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("Ssssss!"); }
    @Override public void comer() { System.out.println("Cobra engole a presa inteira."); }
    @Override public String getEspecie() { return "Cobra"; }
    @Override public void cacar() { System.out.println("Cobra está caçando roedores furtivamente."); }
}
