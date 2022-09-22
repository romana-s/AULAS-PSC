package JOAO;

import java.util.Scanner;

public class aula1908 {

    public static void main(String[] args) {
        //DIA 19/08 JOAO


        //escrever código
        int num1 = 14;
        int num2 = 16;
        int soma1;
        
        soma1 = (num1 + num2);
        System.out.println("A soma é " + soma1);    
        
        
        //EXERCÍCIO 2
        int num3 = 14;
        int num4 = 16;
        int soma2;
        
        soma2 = (num3 + num4);
        //System.out.println("A soma é " + soma);
        System.out.printf("A soma é %d ", soma2);
        // printf = printar com formatação
        // %d é usado para números inteiros
        
        //EXERCÍCIO 3
        //CONVERSÃO DE INT PARA FLOAT
        float num5 = (float) 14.25847564;
        float num6 = (float) 16.51516549;
        float soma3;
        
        soma3 = (num5 + num6);
        //System.out.println("A soma é " + soma);
        System.out.printf("\nA soma é %.2f ", soma3);
        // print f = printar com formatação
        // print %f é usado pata números com casa decimais
        // %.2(duas casas decimais)f = %.2f
        // float = f
        //\n = quebra de linha
        System.out.println("\n");
        
        
        //EXERCÍCIO 4
        char caractere = 'r';
        int codigo = caractere;
        
        System.out.println(codigo);
        
        System.out.println("\n");
        
        
        //EXERCÍCIO CASA
        int numero1, numero2,somar;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        numero1 = teclado.nextInt();
        System.out.println("Digite um número: ");
        numero2 = teclado.nextInt();
        somar = numero1 + numero2;
        
        System.out.println("O resultado da soma é: "+ somar);
        
    }
    
    
}
