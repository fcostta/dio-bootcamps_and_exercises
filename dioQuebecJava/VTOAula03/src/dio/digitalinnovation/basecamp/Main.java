package dio.digitalinnovation.basecamp;

/**Classe de exemplo para exercicio da Aula 3 de Variaveis, Tipos de dados e Operadores aritimeticos.
 */

public class Main {
    public static void main(String[] args){
        System.out.println("prePos");
        prePos();
    }

    public static void prePos(){
        int k = 10;

        int i = ++k;
        int j = k--;
        int x = k;

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);
    }

    private static void aritimetico(){
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a + b;
        int r2 = c - a;
        int r3 = d * b;
        int r4 = e / a;
        int r5 = c % b;

        System.out.println("a+b=" + r1);
        System.out.println("c-a=" + r2);
        System.out.println("d*b=" + r3);
        
    }

}
