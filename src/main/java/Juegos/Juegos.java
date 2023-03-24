/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juegos;

/**
 *
 * @author riolu
 */
public abstract class Juegos {
    
    protected String juegoBase;
    protected String juegoConvertido;
    protected double sensSalida;
    protected String sensSalidaRedondeada;

    public String getSensSalidaRedondeada() {
        return sensSalidaRedondeada;
    }

    public String getJuegoBase() {
        return juegoBase;
    }

    public void setJuegoBase(String juegoBase) {
        this.juegoBase = juegoBase;
    }

    public double getSensSalida() {
        return sensSalida;
    }
    
    public Juegos(String juegoBase){
        this.juegoBase = juegoBase;
    }

    public String getjuegoBase() {
        return juegoBase;
    }

    public String getJuegoConvertido() {
        return juegoConvertido;
    }

    public void setJuegoConvertido(String juegoConvertido) {
        this.juegoConvertido = juegoConvertido;
    }
    
    
    
   
    
    
    
    public abstract String ConvertirSensValorant(double sensEntrada);
    public abstract String ConvertirSensCSGO(double sensEntrada);
    public abstract String ConvertirSensFortnite(double sensEntrada);
    
    
    
}
