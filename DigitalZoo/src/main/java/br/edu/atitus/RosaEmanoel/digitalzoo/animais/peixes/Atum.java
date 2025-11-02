package br.edu.atitus.RosaEmanoel.digitalzoo.animais.peixes;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Peixe;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Nadador;

public class Atum extends Peixe implements Nadador {
    public Atum(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("(borbulhas)"); }
    @Override public void comer() { System.out.println("Atum filtra pequenos peixes e crustáceos."); }
    @Override public String getEspecie() { return "Atum"; }
    @Override public void nadar() { System.out.println("Atum nada em cardumes velozes."); }
}
