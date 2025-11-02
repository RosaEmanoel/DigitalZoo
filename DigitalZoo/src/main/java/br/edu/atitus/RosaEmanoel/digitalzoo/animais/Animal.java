package br.edu.atitus.RosaEmanoel.digitalzoo.animais;

public abstract class Animal {
    private String nome;
    private int idade;
    protected static int contador = 0;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        contador++;
    }

    public abstract void emitirSom();
    public abstract void comer();
    public abstract String getEspecie();

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public static int getContador() { return contador; }
}
