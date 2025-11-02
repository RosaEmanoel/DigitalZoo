package br.edu.atitus.RosaEmanoel.digitalzoo.animais.mamiferos;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Mamifero;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Corredor;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Predador;

public class Cachorro extends Mamifero implements Corredor, Predador {
    public Cachorro(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("Au au!"); }
    @Override public void comer() { System.out.println("Cachorro está comendo ração."); }
    @Override public String getEspecie() { return "Cachorro"; }
    @Override public void correr() { System.out.println("Cachorro está correndo atrás da bola."); }
    @Override public void cacar() { System.out.println("Cachorro está caçando a meia que roubou."); }
}
