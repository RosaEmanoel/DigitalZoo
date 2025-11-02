package br.edu.atitus.RosaEmanoel.digitalzoo.animais.peixes;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Peixe;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Nadador;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Predador;

public class Tubarao extends Peixe implements Nadador, Predador {
    public Tubarao(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("(silencioso)"); }
    @Override public void comer() { System.out.println("Tubarão está se alimentando de peixes."); }
    @Override public String getEspecie() { return "Tubarão"; }
    @Override public void nadar() { System.out.println("Tubarão corta a água com a nadadeira dorsal."); }
    @Override public void cacar() { System.out.println("Tubarão está caçando focas."); }
}
