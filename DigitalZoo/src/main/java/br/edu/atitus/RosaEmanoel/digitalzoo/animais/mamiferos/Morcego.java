package br.edu.atitus.RosaEmanoel.digitalzoo.animais.mamiferos;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Mamifero;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Voador;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Predador;

public class Morcego extends Mamifero implements Voador, Predador {
    public Morcego(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("(ecolocalização)"); }
    @Override public void comer() { System.out.println("Morcego se alimenta de insetos/frutas."); }
    @Override public String getEspecie() { return "Morcego"; }
    @Override public void voar() { System.out.println("Morcego está voando à noite."); }
    @Override public void cacar() { System.out.println("Morcego está caçando insetos em voo."); }
}
