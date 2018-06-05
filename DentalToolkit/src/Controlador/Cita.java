/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author ertim
 */
public class Cita {
    public String Nombre;
    public String Razon;
    public String HoraI;
    public String HoraF;
    public String Dia;
    
    public Cita(){
        
    }
    
    public Cita CrearCita(String Nombre, String Razon, String HoraI,String HoraF, String Dia){
            this.Nombre=Nombre;
            this.Razon=Razon;
            this.HoraI=HoraI;
            this.HoraF=HoraF;
            this.Dia=Dia;
        return this;
    }
    
    public void MostrarCita(){
        System.out.println(this.Nombre+" "+this.Razon+" "+this.HoraI+" "+this.HoraF+" "+this.Dia);
    }
    
    public void ModificarCita(String Nombre, String Razon, String HoraI,String HoraF, String Dia){
        this.Nombre=Nombre;
        this.Razon=Razon;
        this.HoraI=HoraI;
        this.HoraF=HoraF;
        this.Dia=Dia;
    }
}
