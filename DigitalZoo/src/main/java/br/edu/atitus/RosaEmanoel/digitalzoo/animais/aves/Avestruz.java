package br.edu.atitus.RosaEmanoel.digitalzoo.animais.aves;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.Ave;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.Corredor;

public class Avestruz extends Ave implements Corredor {
    public Avestruz(String nome, int idade) { super(nome, idade); }
    @Override public void emitirSom() { System.out.println("Booom!"); }
    @Override public void comer() { System.out.println("Avestruz belisca plantas e insetos."); }
    @Override public String getEspecie() { return "Avestruz"; }
    @Override public void correr() { System.out.println("Avestruz corre a mais de 60 km/h."); }
}
