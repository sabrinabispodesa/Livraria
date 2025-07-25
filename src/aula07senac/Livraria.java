
package aula07senac;

import java.util.ArrayList;
import java.util.Scanner;


public class Aula07Senac {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Livro[] livros = new Livro[20];
       
    // ArrayList não tem fixed value, podemos usar quando não sabemos o número que o user irá adicionar   
       ArrayList<Livro> carrinho = new ArrayList();
       
    //Não declarar variável dentro de "do" se eu vou precisar usa-la em "while"   
       String adicionar2;
       
    // 2 jeitos de adicionar uma valor dentro de uma array. 1 - livros [0] = livro1;    2 - livros[0] = new Livro("Romance", "Uma curva na estrada", 000, 20, true , 7);  
       Livro livro1 = new Livro("Romance", "Uma curva na estrada", 1, 20, true , 7);
       //livros[0] = livro1;
       Livro livro2 = new Livro("Romance", "Como eu era antes de você", 2,30, false , 3);
       Livro livro3 = new Livro("Romance", "It ends with us", 3,25, true ,2);
       Livro livro4 = new Livro("Romance", "Midnight Library", 4,15, true , 20);
       Livro livro5 = new Livro("Romance", "Depois de você", 5,50, false , 10);
       Livro livro6 = new Livro("Ação", "The Da vinci code", 6,20, true , 3);
       Livro livro7 = new Livro("Ação", "Jurrasic Park", 7,20, true , 4);
       Livro livro8 = new Livro("Ação", "Heart of Darkness", 8,35, true , 7);
       Livro livro9 = new Livro("Ação", "Blood and Gold", 9,40, true , 9);
       Livro livro10 = new Livro("Ação", "Treasure Island", 10,20, true , 4);
       Livro livro11 = new Livro("Ficção", "Pride and Prejudice", 11,45, true , 12);
       Livro livro12 = new Livro("Ficção", "Animal farm", 12,100, true , 23);
       Livro livro13 = new Livro("Ficção", "The hobbit", 13,120, false , 30);
       Livro livro14 = new Livro("Ficção", "Far from home", 14,50, true , 4);
       Livro livro15 = new Livro("Ficção", "James", 15,60, true , 2);
       Livro livro16 = new Livro("Comédia", "And they were roommates", 16,75, false , 6);
       Livro livro17 = new Livro("Comédia", "The little world of Liz Climo", 17,23, true , 7);
       Livro livro18 = new Livro("Comédia", "How to become the funny guy", 18,29, true , 90);
       Livro livro19 = new Livro("Comédia", "Everybody wants to rule the world", 19,56, false , 7);
       Livro livro20 = new Livro("Comédia", "Yes Yes Yes", 20,87, true , 45);
       
       livros[0] = livro1;
       livros[1] = livro2;
       livros[2] = livro3;
       livros[3] = livro4;
       livros[4] = livro5;
       livros[5] = livro6;
       livros[6] = livro7;
       livros[7] = livro8;
       livros[8] = livro9;
       livros[9] = livro10;
       livros[10] = livro11;
       livros[11] = livro12;
       livros[12] = livro13;
       livros[13] = livro14;
       livros[14] = livro15;
       livros[15] = livro16;
       livros[16] = livro17;
       livros[17] = livro18;
       livros[18] = livro19;
       livros[19] = livro20;
       

        System.out.println("---------------------------------Bem vindo a biblioteca!------------------------------------------");
     
        // It looks inside of the array for everything, all the books that are inside!
        for (Livro biblioteca : livros){
            System.out.println(biblioteca.toString());
        }
        
        
        
        
        
        do {
     //1       
        System.out.println("Adicione o número do livro ao carrinho");
        int adicionar = scanner.nextInt();
        
        //Now we need to search the array, and find a book base on the ID. When found? that book need to be added to the cart. 
    //2
        for (Livro liv : livros){
            if(adicionar == liv.getLivroID()){      
                carrinho.add(liv);
            }
        }
      
    //1
            System.out.println("Quer adicionar outro livro?");
            adicionar2 = scanner.next();
        }
        while(adicionar2.equalsIgnoreCase("Sim"));
        
        
       
        
        Livro.checkout(carrinho);  
        
        }
        
    }
    

