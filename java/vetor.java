import java.util.Vector;
import java.util.Arrays;

public class vetor {
   public static void main(String[] args) {
    int[] meu_array = new int[5];

    meu_array[0] = 10;
    meu_array[1] = 20;
    meu_array[2] = 30;
    meu_array[3] = 40;
    meu_array[4] = 50;

    int element0 = meu_array[0];
    int element1 = meu_array[1];

    System.out.println(element0);
    System.out.println(element1);

    String[] lista_aluno = new String[5];

    lista_aluno[0] = "Joanes";
    lista_aluno[1] = "Felton";
    lista_aluno[2] = "Heltin";
    lista_aluno[3] = "Buffon";
    lista_aluno[4] = "Ueta";

    String[] lista_cidades = {"ValParaíso", "Santa Lúcia", "Acapulco","Peruíbe"};
    System.out.println(lista_cidades[2]);
 
    for (int i=0; i<lista_aluno.length; i++ ){
         System.out.println("Elemento "+i+": "+lista_aluno[i]);
    }

    for (int i=0; i<lista_cidades.length; i++ ){
        System.out.println("Elemento "+i+": "+lista_cidades[i]);
   }

   int[] array = {10,20,30,40,50};
   System.out.println(Arrays.toString(array));
   System.out.println(Arrays.toString(lista_cidades));
    
   int[] copia = array.clone(); 
   String[] copia_cidade = lista_cidades.clone();
   String[] copia_cidade2 = lista_cidades;

   System.out.println("Copia: " + Arrays.toString(copia));
   System.out.println("Copia: " + Arrays.toString(copia_cidade));

   String[] copia_sel = Arrays.copyOf(lista_cidades,2); 
   System.out.println("copia: " + Arrays.toString(copia_sel));

   int[]  nova_array = {5,6,4,2,4,1,0};
   Arrays.sort(nova_array);

   System.out.println("Ordenada em; "+  Arrays.toString(nova_array));

   int[] array_vazia = new int[5];
   System.out.println(":" + Arrays.toString(array_vazia));
   Arrays.fill(array_vazia,10);
   System.out.println(":" + Arrays.toString(array_vazia));

   boolean resp = Arrays.equals(lista_cidades, copia_cidade);
   System.out.println("São iguais: " + resp);

   if(Arrays.equals(lista_cidades, copia_cidade)){
    System.out.println("Elas são iguais:");
   }else{
    System.out.println("Elas são diferentes");
   }

   int posiçao = Arrays.binarySearch(array, 10);
   System.out.println("Foi localizado " + posiçao);
   
   
}



   }
    
    



