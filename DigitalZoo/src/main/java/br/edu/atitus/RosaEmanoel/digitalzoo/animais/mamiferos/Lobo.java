package br.edu.atitus.RosaEmanoel.digitalzoo.animais.mamiferos;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Mamifero;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Corredor;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Predador;

public class Lobo extends Mamifero implements Corredor, Predador {
    public Lobo(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("Auuu!"); }
    @Override public void comer() { System.out.println("Lobo está comendo carne."); }
    @Override public String getEspecie() { return "Lobo"; }
    @Override public void correr() { System.out.println("Lobo corre silenciosamente pela floresta."); }
    @Override public void cacar() { System.out.println("Lobo está caçando em matilha."); }
}
