package JOAO;

import java.util.Scanner;

public class Exe1 {

        public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade=0, controle;
        for (controle = 1; controle <=5; controle++){
            System.out.println("Digite a idade: ");
            idade = idade + entrada.nextInt();
        }
        System.out.println("A soma das idades é: " + idade);
       
        //SEGUNDO
        Scanner entrada1 = new Scanner(System.in);
        int idade1 = 0, soma = 0, controle1;
        for (controle1 = 1; controle1 <=5; controle1++){
            System.out.println("Digite a idade: ");
            idade1 = entrada1.nextInt();
            soma= soma+idade1;
        }
        System.out.println("A soma das idades é: " + idade1);
       
        //TERCEIRO
        for (int controle2 = 0; controle2 <=1000; controle2++){
            System.out.println(controle2);
        }
       
        //QUARTO
        int inicio , controle3, fim;
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Digite o valor de início: ");
        inicio = entrada2.nextInt();
        System.out.println("Digite o valor de final: ");
        fim = entrada2.nextInt();
        for (controle3 = inicio; controle3 >= fim; controle3--){
            System.out.println(controle3);
        }

        //QUINTO
        int valor1;
        Scanner usuario = new Scanner(System.in);
        System.out.println("Digite um número entre 1 e 10: ");
        valor1 = usuario.nextInt();
       
        while (valor1<=10)  {
            if (valor1%2 == 0){
                System.out.println(valor1);
            }
            valor1++;
        }

    }

}
