package br.edu.atitus.RosaEmanoel.digitalzoo.animais.mamiferos;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Mamifero;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Corredor;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Predador;

public class Leao extends Mamifero implements Corredor, Predador {
    public Leao(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("ROOOAR!"); }
    @Override public void comer() { System.out.println("Leão está devorando a presa."); }
    @Override public String getEspecie() { return "Leão"; }
    @Override public void correr() { System.out.println("Leão corre pela savana."); }
    @Override public void cacar() { System.out.println("Leão está caçando gnus em grupo."); }
}
