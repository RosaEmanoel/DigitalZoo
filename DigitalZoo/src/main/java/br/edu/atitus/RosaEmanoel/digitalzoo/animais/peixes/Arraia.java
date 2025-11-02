package br.edu.atitus.RosaEmanoel.digitalzoo.animais.peixes;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Peixe;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Nadador;

public class Arraia extends Peixe implements Nadador {
    public Arraia(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("(asas ondulando na água)"); }
    @Override public void comer() { System.out.println("Arraia suga pequenos crustáceos do fundo."); }
    @Override public String getEspecie() { return "Arraia"; }
    @Override public void nadar() { System.out.println("Arraia plana graciosamente."); }
}
