/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class Becario {
    //Constructores
    private String nombre;
    private String estado;
    private int num;
    private int pocion1;
 
    public Becario (int num){
    this.nombre="Becario estandar" + num;
    this.num=1;
    this.estado="Normal";
    }
    
    public Becario (String nombre){
    this.nombre=nombre;
    this.estado="normal";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public void BeberPocion(Pocion pocion1){
        String efecto = pocion1.getEfecto();
        
        if(efecto.equals("super poderes")){
        this.estado="superbercario";
         }
        else if (efecto=="veneno"){
            this.estado="muerto";
        }
        else{
            this.estado="vivo";
      
    }
    }
}