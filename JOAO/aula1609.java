package JOAO;
import java.util.Scanner;
public class aula1609 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //PRIMEIRO
        for(int i=0; i<=50;i++){
        System.out.println(i);
        }
        
        
        //SEGUNDO
        int fat, acum = 1;
        System.out.println("Digite um número: " );
        fat = entrada.nextInt();
        for (int i=fat; i>0; i--){
            acum *= i;
            
        }

        System.out.printf("%s! = %s \n", fat, acum);
        //%f - float - %d - inteiro - %s - string

        
        
        //TERCEIRO
        for(int i=0; i<=100;i++){
            if (i%2 == 0){
            System.out.println(i);
            }
        }
        
        //QUARTO
        int mult;
        System.out.println("Digite um número: " );
        mult = entrada.nextInt();        
        
        for (int i=0; i<=10; i++){
            System.out.println(mult + "x" + i + "=" + (mult*i));
            
        }
        
        //QUINTO
        
        int idade = 0, nIdades, media = 0, idades;
        System.out.println("Digite o numero de idades: ");
        nIdades = entrada.nextInt();
        for(int i=0; i<=(nIdades-1); i++){
            System.out.println("Digite da " + (i+1) +" idade: ");
            idades = entrada.nextInt();
            idade = idade+idades;
            media = idade/nIdades;
        } System.out.println("A média das idades é: " + media);
        
        
        //SEXTO
        int num2, ac1 = 0, ac2 = 0;
        for(int i=0; i<=9; i++){
            System.out.println("Digite um número: ");
            num2 = entrada.nextInt();
            if(num2%2 == 0){
                ac1=ac1+1;
            }else ac2=ac2+1;
        }System.out.println("Você digitou " + ac1 + " números pares e " + ac2 + " números ímpares");
        
        //SÉTIMO
        int minue, subt, rest;
        for(int i=0; i<3; i++){
            System.out.println("Digite o minuendo da subtração: ");
            minue = entrada. nextInt();
            System.out.println("Digite o subtraendo da subtração");
            subt= entrada.nextInt();
            rest = minue - subt;
            System.out.println(minue+ "-" +subt + "=" + rest);
        }
        
        //OITAVO
        for(int i=1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0 ){
                System.out.println(i + "Fizz Buzz");
            } else if (i%3 == 0){
                System.out.println(i + "fizz");
            } else if (i%5 == 0){
            System.out.println(i + "buzz");
            }
            
        }
        entrada.close();
        
    }
    
}
