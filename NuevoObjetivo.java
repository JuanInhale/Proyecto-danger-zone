/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

/**
 *
 * @author Juan
 */
public class NuevoObjetivo extends Objetivos{

    public NuevoObjetivo(String ID_objetivos, Integer ObjetivosTotales, Integer ObjetivosCumplidos, String ID_Calendario, String Anotaciones) {
        super(ID_objetivos, ObjetivosTotales, ObjetivosCumplidos, ID_Calendario, Anotaciones);
    }

    @Override
    public void Ingresar_ID_Objetivos(String ID_Objetivos) {
        super.ID_Objetivos = ID_Objetivos;
    }

    @Override
    public void Ingresar_Objetivos_Totales(Integer ObjetivosTotales) {
        super.ObjetivosTotales = ObjetivosTotales;
    }

    @Override
    public void Ingresar_ObjetivosCumplidos(Integer ObjetivosCumplidos) {
        super.ObjetivosCumplidos = ObjetivosCumplidos;
    }

    @Override
    public void Ingresar_ID_Calendario(String ID_Calendario) {
       super.ID_Calendario = ID_Calendario; 
    }

    @Override
    public void Ingresar_Anotaciones(String Anotaciones) {
        super.Anotaciones = Anotaciones;
    }
}
