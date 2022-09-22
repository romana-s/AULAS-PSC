package JOAO;

import java.io.IOException;
import java.util.Scanner;

public class aula0209 {
    public static void main(String[] args) throws IOException {
        
        //PRIMEIRO
        Scanner teclado = new Scanner(System.in);
        int numero1 = 5;
        System.out.println(numero1); // Print com quebra de linha
     
        
        //SEGUNDO
        float numero2 = (float) 3.165;
        System.out.println(numero2);
        
        
        //TERCEIRO
        int valor,controle, soma = 0;
        for (controle=1 ;controle<=3; controle++){
        System.out.println("Digite um número: ");
        valor = teclado.nextInt();
        soma = valor + soma;
        }
        System.out.println("A soma dos valores é: " + soma);
        
        
        //QUINTO
        int tempC = 0, tempF;
        System.out.println("Digite a temperatura em graus °C: ");
        tempC = teclado.nextInt();
        tempF = tempC *(9/5)+32;
        System.out.println("A temperatura em °F é: " + tempF);
        
        //SEXTO
        float km = 26, m = 0;
        m = (float) ((km/1)/3.6);
        System.out.println("A velocidade é:" + m + "m/s");
        System.out.printf("A velocidade é %.2f", m); //%.2f número de casas decimais
        
        //SÉTIMO
        int numero3, ant;
        System.out.println("\nDigite um número: ");
        numero3 = teclado.nextInt();
        ant = numero3 - 1;
        System.out.println("O antecessor do " + numero3 + " é: " + ant);
        
        
        //OITAVO
        int nasc, idade;
        System.out.println("Digite o ano em que você nasceu: ");
        nasc = teclado.nextInt();
        idade = 2022 - nasc;
        System.out.println("A sua idade é: " + idade);
        
        //NONO
        double area, raio = 3.5;
        area = 3.141592653 * (raio*raio);
        System.out.printf("A area da circunferência é: %.2f", area);
        
        
        //QUARTO
        char caractere;
        System.out.println("\nDigite um caractere: ");
        caractere = (char) System.in.read();
        int codigo = caractere;
        System.out.println("O caractere em código é:" + codigo);
        
        //DESAFIO NÃO CONCLUIDO
        //USUÁRIO DIGITA 5 NÚMEROS E O SISTEMA DEVE PRINTAR QUAIS DELES SÃO NÚMEROS PRIMOS

        /* 
        int num ,primo;
        for (num=1 ;num<=5; num++){
        System.out.println("Digite o " + num + "o número: ");
        num = teclado.nextInt();
        if (num) {
        
        }
        System.out.println("Os números primos são: " + s);
        
        
        //TERNÁRIO
        int valor, valor1, valor2;
        valor = valor1 > valor2 ? : valor2;
        */
        
    }
    
}
    

