package br.edu.atitus.RosaEmanoel.digitalzoo.animais.repteis;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Reptil;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Corredor;

public class Basilisco extends Reptil implements Corredor {
    public Basilisco(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("(raspas rápidas)"); }
    @Override public void comer() { System.out.println("Basilisco captura insetos e pequenos vertebrados."); }
    @Override public String getEspecie() { return "Basilisco"; }
    @Override public void correr() { System.out.println("Basilisco corre inclusive sobre a água!"); }
}
