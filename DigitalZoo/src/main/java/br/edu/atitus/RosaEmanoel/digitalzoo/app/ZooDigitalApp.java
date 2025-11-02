package br.edu.atitus.RosaEmanoel.digitalzoo.app;

import br.edu.atitus.RosaEmanoel.digitalzoo.animais.*;
import br.edu.atitus.RosaEmanoel.digitalzoo.animais.aves.*;
import br.edu.atitus.RosaEmanoel.digitalzoo.animais.mamiferos.*;
import br.edu.atitus.RosaEmanoel.digitalzoo.animais.peixes.*;
import br.edu.atitus.RosaEmanoel.digitalzoo.animais.repteis.*;
import br.edu.atitus.RosaEmanoel.digitalzoo.comportamentos.*;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class ZooDigitalApp {
    private static final List<Animal> animais = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menu();
            String op = sc.nextLine();
            switch (op) {
                case "1" -> cadastrarAnimal();
                case "2" -> listarTodos();
                case "3" -> listarPorInterface(Corredor.class);
                case "4" -> listarPorInterface(Nadador.class);
                case "5" -> listarPorInterface(Voador.class);
                case "6" -> listarPorInterface(Predador.class);
                case "7" -> System.out.println("Total de animais: " + Animal.getContador());
                case "0" -> { System.out.println("Saindo..."); return; }
                default -> System.out.println("Opção inválida!");
            }
            System.out.println();
        }
    }

    private static void menu() {
        System.out.println("==== DIGITAL ZOO ====");
        System.out.println("1) Cadastrar Animal");
        System.out.println("2) Listar Todos Animais");
        System.out.println("3) Listar Animais Corredores");
        System.out.println("4) Listar Animais Nadadores");
        System.out.println("5) Listar Animais Voadores");
        System.out.println("6) Listar Animais Predadores");
        System.out.println("7) Exibir Total de Animais");
        System.out.println("0) Sair");
        System.out.print("Opção: ");
    }

    private static void cadastrarAnimal() {
        System.out.println("Grupo? 1) Mamífero  2) Ave  3) Peixe  4) Réptil");
        String grupo = sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        nome = StringUtils.capitalize(nome.trim());

        System.out.print("Idade (anos): ");
        int idade = lerInt();

        Animal novo = switch (grupo) {
            case "1" -> cadastrarMamifero(nome, idade);
            case "2" -> cadastrarAve(nome, idade);
            case "3" -> cadastrarPeixe(nome, idade);
            case "4" -> cadastrarReptil(nome, idade);
            default -> null;
        };

        if (novo != null) {
            animais.add(novo);
            System.out.println(novo.getEspecie() + " cadastrado!");
        } else {
            System.out.println("Grupo inválido.");
        }
    }

    private static Animal cadastrarMamifero(String nome, int idade) {
        System.out.println("Mamífero? 1) Cachorro  2) Leão  3) Lobo  4) Morcego");
        return switch (sc.nextLine()) {
            case "1" -> new Cachorro(nome, idade);
            case "2" -> new Leao(nome, idade);
            case "3" -> new Lobo(nome, idade);
            case "4" -> new Morcego(nome, idade);
            default -> null;
        };
    }

    private static Animal cadastrarAve(String nome, int idade) {
        System.out.println("Ave? 1) Águia  2) Avestruz  3) Papagaio  4) Pinguim");
        return switch (sc.nextLine()) {
            case "1" -> new Aguia(nome, idade);
            case "2" -> new Avestruz(nome, idade);
            case "3" -> new Papagaio(nome, idade);
            case "4" -> new Pinguim(nome, idade);
            default -> null;
        };
    }

    private static Animal cadastrarPeixe(String nome, int idade) {
        System.out.println("Peixe? 1) Tubarão  2) Atum  3) Peixe-palhaço  4) Arraia");
        return switch (sc.nextLine()) {
            case "1" -> new Tubarao(nome, idade);
            case "2" -> new Atum(nome, idade);
            case "3" -> new PeixePalhaco(nome, idade);
            case "4" -> new Arraia(nome, idade);
            default -> null;
        };
    }

    private static Animal cadastrarReptil(String nome, int idade) {
        System.out.println("Réptil? 1) Cobra  2) Jacaré  3) Tartaruga  4) Basilisco");
        return switch (sc.nextLine()) {
            case "1" -> new Cobra(nome, idade);
            case "2" -> new Jacare(nome, idade);
            case "3" -> new Tartaruga(nome, idade);
            case "4" -> new Basilisco(nome, idade);
            default -> null;
        };
    }

    private static void listarTodos() {
        if (animais.isEmpty()) { System.out.println("Nenhum animal cadastrado."); return; }
        for (Animal a : animais) {
            System.out.println("- " + a.getEspecie() + " | Nome: " + a.getNome() + ", Idade: " + a.getIdade());
            a.emitirSom();
            a.comer();
        }
    }

    private static <T> void listarPorInterface(Class<T> iface) {
        boolean achou = false;
        for (Animal a : animais) {
            if (iface.isInstance(a)) {
                achou = true;
                System.out.println("- " + a.getEspecie() + " | Nome: " + a.getNome() + ", Idade: " + a.getIdade());
                if (a instanceof Corredor c && iface == Corredor.class) c.correr();
                if (a instanceof Nadador n && iface == Nadador.class) n.nadar();
                if (a instanceof Voador v && iface == Voador.class) v.voar();
                if (a instanceof Predador p && iface == Predador.class) p.cacar();
            }
        }
        if (!achou) System.out.println("Nenhum animal encontrado para " + iface.getSimpleName() + ".");
    }

    private static int lerInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Valor inválido. Digite novamente: ");
            }
        }
    }
}
