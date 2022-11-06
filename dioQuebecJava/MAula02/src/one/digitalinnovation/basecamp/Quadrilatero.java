package one.digitalinnovation.basecamp;

/**
 * Classe de exemplo para o exercicio da Aula 2 de Metodos (Sobrecarga)
 * repositorio do professor: https://github.com/tlcdio/MAula02
 */

public class Quadrilatero {

    public static void area(double lado){

        System.out.println("Área do quadrado:" + lado * lado);

    }

    public static void area(double lado1, double lado2){

        System.out.println("Área do retangulo: " + lado1 * lado2);

    }

    public static void area(double baseMaior, double baseMenor, double altura){

        System.out.println("Área do trapézio: " + ((baseMaior+baseMenor)*altura) / 2);
    }
}
