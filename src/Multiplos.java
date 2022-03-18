/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

Entrada
A entrada contém valores inteiros.

Saída
A saída deve conter uma das mensagens conforme descrito acima.
* */

import java.util.Scanner;

public class Multiplos{

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        int A  = leitor.nextInt();
        int B  = leitor.nextInt();
        if ( A%B==0||B%A==0  ) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");


        }
    }

}
