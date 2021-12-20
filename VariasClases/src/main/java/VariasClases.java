/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class VariasClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int identificador=1;
        String ingrediente2, ingrediente3;
        
        
        Pocion p1 = new Pocion(identificador, "moco de troll");
        identificador++;
        Pocion p2 = new Pocion(identificador, "pata de tarántula");
        identificador++;
        Pocion p3 = new Pocion(identificador, "caspa de unicornio");
        
        ingrediente2 = generaIngrediente();
        ingrediente3 = generaIngrediente();
       
        
        ingrediente2 = generaIngrediente();
        ingrediente3 = generaIngrediente();
     
        
        ingrediente2 = generaIngrediente();
        ingrediente3 = generaIngrediente();
      
 
        p1.toString();
        p2.toString();
        p3.toString();
    }
     public static String generaIngrediente(){
  
       int aleat = (int) (Math.random()*3);
       
       
       switch(aleat){
            case 0:
                return "moco de troll";
              
            case 1:
                return "pata tarantula";
               
            default:
                return "caspa unicornio";
           
        }
       
    } 
    
}
