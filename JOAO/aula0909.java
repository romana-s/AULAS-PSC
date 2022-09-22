package JOAO;

import java.util.Scanner;;

public class aula0909 {
    public static void main(String[] args) {
        //AULA JOAO 09/09

    
        Scanner entrada = new Scanner(System.in);

        //ATIVIDADE 1
        double dvd, dvs, resto, quo;
        System.out.println("Digite um número: ");
        dvd = entrada.nextInt();
        System.out.println("Digite outro número: ");
        dvs = entrada.nextInt();
        quo = (int) (dvd/dvs);
        resto = dvd-(dvs*quo);
        System.out.println("O quociente dessa operação é: " + resto);
    
        // ATIVIDADE1 PROFESSOR
        double numeroUm;
        double numeroDois;
        double rest;
    
        System.out.println("Insira um número: ");
        numeroUm = entrada.nextInt();
        System.out.println("Insira um número: ");
        numeroDois = entrada.nextInt();
        
        rest = numeroUm-numeroDois * (int)(numeroUm / numeroDois);
        System.out.println(rest);
    
    
    
        //ATIVIDADE 2
        double salario, ir, salliq;
        System.out.println("Digite o valor da salliq: ");
        salliq = entrada.nextInt();
        System.out.println("Digite o valor do salario: ");
        salario = entrada.nextInt();
        if (salliq>=salario){
            System.out.println("Verdadeiro");
        } else System.out.println("Falso");
    
        System.out.println("Digite o valor da salliq: ");
        salliq = entrada.nextInt();
        if (salliq<salliq){
            System.out.println("Verdadeiro");
        } else System.out.println("Falso");
    
        System.out.println("Digite o valor da salliq: ");
        salliq = entrada.nextInt();
        System.out.println("Digite o valor do salário: ");
        salario = entrada.nextInt();
        System.out.println("Digite o valor do IR: ");
        ir = entrada.nextInt();
    
    
        if (ir + salario == salliq){
            System.out.println("Verdadeiro");
        } else System.out.println("Falso");
    
    
        int a = 3, b = 7, c = 4;
    
        if ((a + c)> b){
            System.out.println("Verdadeiro");
        } else System.out.println("Falso");
    
        if (b>=(a+2)){
            System.out.println("Verdadeiro");
        } else System.out.println("Falso");
    
        if (c == (b-a)){
            System.out.println("Verdadeiro");
        } else System.out.println("Falso");
       
        if ((b+a)<=c){
            System.out.println("Verdadeiro");
        } else System.out.println("Falso");
    
        if ((c + a)> b){
            System.out.println("Verdadeiro");
        } else System.out.println("Falso");
    
    
    
    
    
        //ATIVIDADE3
        int  a1=5 , b1=4, c1=3, d1=6;
        if (a1>c1 && c1<=d1){
            System.out.println("Verdadeiro");
        } else System.out.println("Falso");
    
        if (a1+b1>10 || a1+b1 == c1 + +d1){
            System.out.println("Verdadeiro");
        } else System.out.println("Falso");
    
        if (a1>=c1 && d1>=c1){
            System.out.println("Verdadeiro");
        } else System.out.println("Falso");
    
    
        //ATIVIDADE4
        int numero;
        System.out.println("Digite um número inteiro: ");
        numero = entrada.nextInt();
        if (numero%2 == 0){
            System.out.print("O número que você digitou é par");
            if (numero < 0 ){
                System.out.print(" e negativo.");
            } System.out.println(" e positivo.");
        } else { System.out.print("O numero que você digitou é impar");            
            if (numero < 0 ){
                System.out.print(" e negativo.");
            } System.out.println(" e positivo.");
        }
        		
        //ATIVIDADE 5
		String genero;
		float altura, pesoIdeal;
		System.out.println("Qual o seu sexo? M ou F?");
		genero = entrada.next();
		System.out.println("Qual sua altura?");
		altura = entrada.nextFloat();
		if (genero == "F") {
			pesoIdeal = (float) 62.1 * altura - (float) 44.7;
			System.out.println("Seu peso ideal é: " + pesoIdeal);
		} else {
			pesoIdeal = (float) 72.7 * altura - (float) 58;
			System.out.println("Seu peso ideal é: " + pesoIdeal);
		}


		//ATIVIDADE 6
		float multa, quilos;
		System.out.println("Digite a quantidade em kilos de peixe: ");
		quilos = entrada.nextFloat();
		multa = (quilos - 50) * (float) 4;
		System.out.println("O valor da multa é de: " + multa);

        

        //ATIVIDADE
        int idade;
        String nome, sexo, gravida;
        float quantHemo;
            
        System.out.println("Digite seu nome: ");
        nome = entrada.next();
        System.out.println("Digite seu gênero: ");
        sexo = entrada.next();
            
        if ("feminino".equals(sexo) || "f".equals(sexo)){
                System.out.println("Você está grávida? ");
                gravida = entrada.next();
            if ("s".equals(gravida) || "sim".equals(gravida)){
                System.out.println("Digite a quantidade de hemoglobina: ");
                quantHemo = entrada.nextFloat();
                if (quantHemo == 11){
                    System.out.println("Olá, " + nome + "! \n A sua quantidade de Hemoglobina é " + quantHemo + " e isso significa que está normal pois como você está gravida a quantidade ideal é 11g/dl");
                    } else{
                    System.out.println("Olá, " + nome + "! \n A sua quantidade de Hemoglobina é " + quantHemo + " e isso significa que está alterada pois a quantidade ideal para a sua idade é 11g/dl");
                }
            }
        } else 
                
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        System.out.println("Digite a quantidade de Hemoglobina: ");
        quantHemo = entrada.nextFloat();
            
            
            
    
        if (idade >=2 && idade <=6) { 
        if (quantHemo >= 11.5 && quantHemo <= 13.5){
                System.out.println("Olá, " + nome + "! \n A sua quantidade de Hemoglobina é " + quantHemo + " e isso significa que está normal pois a quantidade ideal para a sua idade é 11.5 a 13.5g/dl");
            } else{
                System.out.println("Olá, " + nome + "! \n A sua quantidade de Hemoglobina é " + quantHemo + " e isso significa que está alterada pois a quantidade ideal para a sua idade é 11.5 a 13.5g/dl");
            }
        }
            
            
            
            
            
        if (idade >=6 && idade <=12) { 
            if (quantHemo >= 11.5 && quantHemo <= 15.5){
                System.out.println("Olá, " + nome + "! \n A sua quantidade de Hemoglobina é " + quantHemo + " e isso significa que está normal pois a quantidade ideal para a sua idade é 11.5 a 15.5g/dl");
            } else{
                System.out.println("Olá, " + nome + "! \n A sua quantidade de Hemoglobina é " + quantHemo + " e isso significa que está alterada pois a quantidade ideal para a sua idade é 11.5 a 15.5g/dl");
            }
        }
            
            
            
        if (idade >12 && ("masculino".equals(sexo) ||"m".equals(sexo))) { 
            if (quantHemo >= 14 && quantHemo <= 18){
                System.out.println("Olá, " + nome + "! \n A sua quantidade de Hemoglobina é " + quantHemo + " e isso significa que está normal pois a quantidade ideal para a sua idade é 14 a 18g/dl");
            } else{
                System.out.println("Olá, " + nome + "! \n A sua quantidade de Hemoglobina é " + quantHemo + " e isso significa que está alterada pois a quantidade ideal para a sua idade é 14 a 18g/dl");
            }
        }
            
            
            
        if (idade>12 && ("feminino".equals(sexo) || "f".equals(sexo))) { 
            if (quantHemo >= 12 && quantHemo <= 16){
                System.out.println("Olá, " + nome + "! \n A sua quantidade de Hemoglobina é " + quantHemo + " e isso significa que está normal pois a quantidade ideal para a sua idade é 12 a 16g/dl");
            } else{
                System.out.println("Olá, " + nome + "! \n A sua quantidade de Hemoglobina é " + quantHemo + " e isso significa que está alterada pois a quantidade ideal para a sua idade é 12 a 16g/dl");
            }
        }
    }

}
