
package aula07senac;

import java.util.ArrayList;

public class Livro {
    private String genero;
    private String nomeLivro;
    private int livroID;
    private int preco;
    private boolean isAvailable;
    private int quantosAvailable;
    
    public Livro(String genero, String nomeLivro, int livroID, int preco, boolean isAvailable, int quantosAvailable ){
        this.genero = genero;
        this.nomeLivro = nomeLivro;
        this.livroID = livroID;
        this.preco = preco;              
        this.isAvailable = isAvailable;
        this.quantosAvailable = quantosAvailable;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public void setGenero(String genero ){
    this.genero = genero;
    }
    
    
    public String getnomeLivro(){
        return this.nomeLivro;
    }
    
    public void setnomeLivro(String nomeLivro ){
    this.nomeLivro = nomeLivro;
    }
    
     public int getLivroID(){
        return this.livroID;
    }
    
    public void setLivroID (int livroID ){
    this.livroID = livroID;
    }    
    
    public int getPreco(){
        return this.preco;
    }
    
    public void setPreco (int preco ){
    this.preco = preco;
    }    
    
     public boolean getIsAvailable(){
        return this.isAvailable;
    }
    
    public void setIsAvalable (boolean isAvalable ){
    this.isAvailable = isAvalable;
    }    
    
    public int getQuantosAvailable(){
        return this.quantosAvailable;
    }
    
    public void setQuantosAvailable (int quantosAvailables ){
    this.quantosAvailable = quantosAvailables;
    }    
    
    public String simNao(){
        if (isAvailable){
           return "Sim";
        }else{
            return "Não";
        }
    }
    
    
    
// to(control + space)
    
    @Override
    public String toString() {
        return  "Número:" + livroID + " ----> " + "Gênero:" + genero + " ----> " +" Livro:" + nomeLivro + " ----> " + "Preço:" + " R$" + preco + " ----> " + " Disponibilidade:"+ simNao(); 
    }
    
    //MEthod that will checkout the user, by telling him/her all of the books that they have bought and also the total price, it will get an arraylist as param.
    
    
    //Static is not part
    public static void checkout(ArrayList<Livro> listaDeLivros){
        int totalprice = 0;
        System.out.println("\"----------------- Livros Adicionados----------------- \"");
        for (Livro liv : listaDeLivros){
           System.out.println( liv.getnomeLivro());
           totalprice = totalprice + liv.getPreco();
        }
         System.out.println("\"-----------------Obrigado pela visita!----------------- \" ");
        System.out.println("O seu total é: R$" + totalprice);
        
    }  
}
