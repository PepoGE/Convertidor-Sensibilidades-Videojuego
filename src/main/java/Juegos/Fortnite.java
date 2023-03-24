/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Juegos;

/**
 *
 * @author riolu
 */
public class Fortnite extends Juegos {
       public Fortnite(String nombre) {
        super(nombre);
    }

    @Override
    public String ConvertirSensValorant(double sensEntrada) {
        setJuegoConvertido("Valorant");
        sensSalida = sensEntrada / 12.601;
        sensSalidaRedondeada = String.format("%.3f", sensSalida);
        return sensSalidaRedondeada;
    }

    @Override
    public String ConvertirSensCSGO(double sensEntrada) {
        setJuegoConvertido("CSGO");
        sensSalida = sensEntrada / 3.960396;
        sensSalidaRedondeada = String.format("%.3f", sensSalida);
        return sensSalidaRedondeada;
    }

    @Override
    public String ConvertirSensFortnite(double sensEntrada) {
      setJuegoConvertido("Fortnite");
        sensSalida = sensEntrada;
        sensSalidaRedondeada = String.format("%.3f", sensSalida);
        return sensSalidaRedondeada;
    }

}
