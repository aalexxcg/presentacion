/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Pocion {
    
    //Atributos
    private int identificador;
    private String ingrediente1;
    private String ingrediente2;
    private String ingrediente3;
    private String efecto;
    
    //Constructores
    public Pocion(int identificador){
    this.identificador=identificador;
    this.ingrediente1=null;
    this.ingrediente2=null;
    this.ingrediente3=null;
    this.efecto=null;
    }
    
    public Pocion(int identificador, String ingrediente1){
    this.ingrediente2=null;
    this.ingrediente3=null;
    this.efecto="sopa";
    }
    
    //metodos

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public String getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(String ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }
    
    public void prepararBase(String ingrediente){
        this.ingrediente1=ingrediente;
        this.efecto="sopa";
    
   
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
      
     public void prepararpocion(){
      this.ingrediente2= generaIngrediente();
      this.ingrediente3= generaIngrediente();
   
      if((this.ingrediente1.equals("mocos de troll"))&&(this.ingrediente2.equals("mocos de troll"))){
            this.efecto="veneno";
        }
        else if((this.ingrediente2.equals("mocos de troll"))&&(this.ingrediente3.equals("mocos de troll"))){
            this.efecto="veneno";
        }
        else if((this.ingrediente1.equals("mocos de troll"))&&(this.ingrediente3.equals("mocos de troll"))){
            this.efecto="veneno";
        }
        else if((this.ingrediente1.equals("capa unircornio"))&&(this.ingrediente2.equals("capa unicornio"))){
            this.efecto="super poderes";
        }
        else if((this.ingrediente2.equals("capa unicornio"))&&(this.ingrediente3.equals("capa unicornio"))){
            this.efecto="super poderes";
        }
        else if((this.ingrediente1.equals("capa unircornio"))&&(this.ingrediente3.equals("capa unicornio"))){
            this.efecto="super poderes";
        }
        else{
        this.efecto="normal";
        }
     }

    @Override
    public String toString() {
        return "La pocion con idetificador" +this.identificador + 
                "e ingredientes: " + this.ingrediente1 + this.ingrediente2 + 
                this.ingrediente3 + " y con efecto: " + this.efecto;
    }
     
    
}
  


