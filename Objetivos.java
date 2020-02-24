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
public abstract class Objetivos {
    private String ID_objetivos;
    Integer ObjetivosTotales;
    Integer ObjetivosCumplidos;
    String ID_Calendario;
    String Anotaciones;
    String ID_Objetivos;

    public Objetivos(String ID_objetivos, Integer ObjetivosTotales, Integer ObjetivosCumplidos, String ID_Calendario, String Anotaciones) {
        this.ID_objetivos = ID_objetivos;
        this.ObjetivosTotales = ObjetivosTotales;
        this.ObjetivosCumplidos = ObjetivosCumplidos;
        this.ID_Calendario = ID_Calendario;
        this.Anotaciones = Anotaciones;
    }

    public String getID_objetivos() {
        return ID_objetivos;
    }

    public Integer getObjetivosTotales() {
        return ObjetivosTotales;
    }

    public Integer getObjetivosCumplidos() {
        return ObjetivosCumplidos;
    }

    public String getID_Calendario() {
        return ID_Calendario;
    }

    public String getAnotaciones() {
        return Anotaciones;
    }

    public void setID_objetivos(String ID_objetivos) {
        this.ID_objetivos = ID_objetivos;
    }

    public void setObjetivosTotales(Integer ObjetivosTotales) {
        this.ObjetivosTotales = ObjetivosTotales;
    }

    public void setObjetivosCumplidos(Integer ObjetivosCumplidos) {
        this.ObjetivosCumplidos = ObjetivosCumplidos;
    }

    public void setID_Calendario(String ID_Calendario) {
        this.ID_Calendario = ID_Calendario;
    }

    public void setAnotaciones(String Anotaciones) {
        this.Anotaciones = Anotaciones;
    }

public abstract void Ingresar_ID_Objetivos(String ID_Objetivos);
public abstract void Ingresar_Objetivos_Totales(Integer ObjetivosTotales);
public abstract void Ingresar_ObjetivosCumplidos(Integer ObjetivosCumplidos);
public abstract void Ingresar_ID_Calendario(String ID_Calendario);
public abstract void Ingresar_Anotaciones (String Anotaciones);       
}
