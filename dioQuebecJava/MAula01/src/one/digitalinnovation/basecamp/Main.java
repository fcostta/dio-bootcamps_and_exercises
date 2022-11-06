package one.digitalinnovation.basecamp;

/**
 * Classe principal dos exercicios da Aula 1 de Métodos Bootcamp Java Quebec.
 * Repositorio do professor: https://github.com/tlcdio/MAula01
 */

public class Main {

    public static void main(String[] args){

        // Calculadora
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        // Mensagem
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem( 9);
        Mensagem.obterMensagem( 14);
        Mensagem.obterMensagem( 1);

        // Empréstimo
        System.out.println("Exercicio empréstimo");
        Emprestimo.calcular( 1000, Emprestimo.getDuasParcela());
        Emprestimo.calcular( 1000, Emprestimo.getTresParcela());
        Emprestimo.calcular(1000, 5);

    }


}
