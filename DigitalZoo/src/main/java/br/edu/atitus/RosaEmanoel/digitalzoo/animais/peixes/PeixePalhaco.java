package br.edu.atitus.RosaEmanoel.digitalzoo.animais.peixes;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Peixe;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Nadador;

public class PeixePalhaco extends Peixe implements Nadador {
    public PeixePalhaco(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("(borbulhas curiosas)"); }
    @Override public void comer() { System.out.println("Peixe-palhaço belisca anêmonas e algas."); }
    @Override public String getEspecie() { return "Peixe-palhaço"; }
    @Override public void nadar() { System.out.println("Peixe-palhaço nada entre anêmonas."); }
}
