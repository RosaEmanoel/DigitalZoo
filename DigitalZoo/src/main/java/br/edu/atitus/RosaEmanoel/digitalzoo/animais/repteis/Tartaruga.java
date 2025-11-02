package br.edu.atitus.RosaEmanoel.digitalzoo.animais.repteis;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Reptil;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Nadador;

public class Tartaruga extends Reptil implements Nadador {
    public Tartaruga(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("(silenciosa)"); }
    @Override public void comer() { System.out.println("Tartaruga mastiga algas e plantas."); }
    @Override public String getEspecie() { return "Tartaruga"; }
    @Override public void nadar() { System.out.println("Tartaruga nada com movimentos lentos e firmes."); }
}
