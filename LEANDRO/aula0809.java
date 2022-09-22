package LEANDRO;
import java.util.Scanner;

public class aula0809 {
    public static void main(String[] args) {
        
        //exe1
        Scanner entrada = new Scanner(System.in);
        int numeros[]= new int[10];
        for(int i = 0; i<10;i++){
            System.out.println("Digite o "+(i+1)+"° valor: ");
            numeros[i]=entrada.nextInt();
        }
        for (int i =9; i>=0; i--){
            System.out.println(numeros[i]);
        }


	    //EXE2
        int valores[]= new int[10];       
            int indice = 0;
        for(int v =0; v<10; v++){
            System.out.println("Digite o "+(v+1)+"° valor: ");
            valores[v]=entrada.nextInt();
        }
        int menor = valores[0];    
        for(int v=0; v<10;v++){
            if(valores[v]<menor){
                menor=valores[v];
                indice = v;
            }
        }
        System.out.println("O menor número é: "+menor+ "e o indice é:" + indice);

	    //exe3

        int vetora[]= new int[8];
        int vetorb[]= new int[8];  
        for(int a =0; a<8; a++){
            System.out.println("Digite o "+(a+1)+"° valor: ");
            vetora[a]=entrada.nextInt();
            vetorb[a]=vetora[a]*3;
        }

        
        for (int a =0; a<8; a++){
            System.out.println(vetorb[a]);
	}
        
        //exe4
        double vetorA []= new double[4];
        double vetorB []= new double[7];
        double vetorC []= new double[11];
        
        for(int z =0; z<4; z++){
            System.out.println("Digite o "+(z+1)+"° valor: ");
            vetorA[z]=entrada.nextDouble();

        }
        for(int z =0; z<7; z++){
            System.out.println("Digite o "+(z+1)+"° valor: ");
            vetorB[z]=entrada.nextDouble();
            
        }
        for(int z =0; z<7; z++){
            if (z<4){
                vetorC[z]=vetorA[z];
            } else 
                vetorC[z]=vetorB[z-4];
        }
        for(int z =0; z<11; z++){
            System.out.println(vetorC[z]);
        
        }

   
        entrada.close();
    }

    
}
