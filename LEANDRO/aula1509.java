package LEANDRO;
import java.util.Scanner;
public class aula1509 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int linha, coluna;
        int numeros[][] = new int[2][2];
        int acum0 = 0, acum1 = 0;
        for (linha = 0; linha < 2; linha++) {
            for (coluna = 0; coluna < 2; coluna++) {
                System.out.println("Digite um número:");
                numeros[linha][coluna] = entrada.nextInt();
            }
        }
        for (linha = 0; linha < 2; linha++) {
            for (coluna = 0; coluna < 2; coluna++) {
                //System.out.println("O número na linha " + (linha + 1) + " e na coluna " + (coluna + 1) + " é: " + numeros[linha][coluna]);
                //System.out.println("Linha: " + (linha + 1) + ", Coluna: " + (coluna + 1) + ": " + numeros[linha][coluna]);
                //System.out.print(numeros[linha][coluna] + " ");
                System.out.printf("\t %d", numeros[linha][coluna]);
                if (linha==0 ){
                    acum0=acum0+numeros[linha][coluna];
                }else acum1=acum1+numeros[linha][coluna];
            }
            System.out.println("");
        }
        System.out.println("A somatória da linha 1 é: " + acum0);
        System.out.println("A somatória da linha 2 é: " + acum1);
        System.out.println("A somatória da matriz é: " + (acum0+acum1));
        
        //ATIVIDADE3
        
        String word1, word2, word3;
        System.out.println("Digite uma palavra: ");
        word1 = entrada.next();
        System.out.println("Digite uma palavra: ");
        word2 = entrada.next();
        System.out.println("Digite uma palavra: ");
        word3 = entrada.next();
        double i;
        
        for (i=word1.length()-1; i>=0; i--){
            System.out.print(word1.charAt((int) i));
        }
        for (i=word2.length()-1; i>=0; i--){
            System.out.print(word2.charAt((int) i));
        }
        for (i=word3.length()-1; i>=0; i--){
            System.out.print(word3.charAt((int) i));
        }
        
        
        
        //ATIVIDADE4
        String mat[][] =  new String[3][1];
        for(int linha1 = 0; linha1 <3; linha1++){
            for(int coluna1 = 0; coluna1 <1; coluna1++){
                System.out.println("Digite uma palavra: ");
                mat[linha1][coluna1]=entrada.nextLine();
            }
        }
        
        for(int linha1 = 0; linha1 <3; linha1++){
            for(int coluna1 = 0; coluna1 <1; coluna1++){
                for (int j = mat[linha1][coluna1].length()-1;j>=0; j--){
                    System.out.printf("%c",mat[linha1][coluna1].charAt(j));
                }
                System.out.println("");
            }
        }
        
        //ATIVIDADE5
        //ATIVIDADE INCOMPLETA

        /* 
        String comp[][]=new String[2][1];
        for  (int linha2=0; linha2<2; linha2++){
            for  (int coluna2=0; coluna2<2; coluna2++){
                System.out.println("Digite uma palavra");
                comp[linha2][coluna2]=entrada.nextLine();
            }
        }
        if (comp[linha2][coluna2].equals(comp[linha2][coluna2])){

        }
        */
    }      
}
