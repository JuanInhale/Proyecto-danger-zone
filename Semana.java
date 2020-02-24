package Proyecto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiago
 */

//extends Calendario;
public abstract class Semana {
    String DiasLaborales;
    String DiaDeClases;
    String DiasDeActividades;
    boolean Laborales;
    boolean Clases;
    boolean Actividades;
    String DiasLibres;
    String ID_Semana;
    private String ID_Calendario;

    public Semana(String DiasLaborales, String DiaDeClases, String DiasDeActividades, boolean Laborales, boolean Clases, boolean Actividades, String DiasLibres, String ID_Semana, String ID_Calendario) {
        this.DiasLaborales = DiasLaborales;
        this.DiaDeClases = DiaDeClases;
        this.DiasDeActividades = DiasDeActividades;
        this.Laborales = Laborales;
        this.Clases = Clases;
        this.Actividades = Actividades;
        this.DiasLibres = DiasLibres;
        this.ID_Semana = ID_Semana;
        this.ID_Calendario = ID_Calendario;
    }

    public String getDiasLaborales() {
        return DiasLaborales;
    }

    public void setDiasLaborales(String DiasLaborales) {
        this.DiasLaborales = DiasLaborales;
    }

    public String getDiaDeClases() {
        return DiaDeClases;
    }

    public void setDiaDeClases(String DiaDeClases) {
        this.DiaDeClases = DiaDeClases;
    }

    public String getDiasDeActividades() {
        return DiasDeActividades;
    }

    public void setDiasDeActividades(String DiasDeActividades) {
        this.DiasDeActividades = DiasDeActividades;
    }

    public boolean isLaborales() {
        return Laborales;
    }

    public void setLaborales(boolean Laborales) {
        this.Laborales = Laborales;
    }

    public boolean isClases() {
        return Clases;
    }

    public void setClases(boolean Clases) {
        this.Clases = Clases;
    }

    public boolean isActividades() {
        return Actividades;
    }

    public void setActividades(boolean Actividades) {
        this.Actividades = Actividades;
    }

    public String getDiasLibres() {
        return DiasLibres;
    }

    public void setDiasLibres(String DiasLibres) {
        this.DiasLibres = DiasLibres;
    }

    public String getID_Semana() {
        return ID_Semana;
    }

    public void setID_Semana(String ID_Semana) {
        this.ID_Semana = ID_Semana;
    }

    public String getID_Calendario() {
        return ID_Calendario;
    }

    public void setID_Calendario(String ID_Calendario) {
        this.ID_Calendario = ID_Calendario;
    }
    
    public abstract void IngresarDiasLaborales (String DL);
    public abstract void ingresarDiasDeClases(String DDC);
    public abstract void IngresarDiasDeActividades(String DDA);
    public abstract void IngresarSiLabura(boolean L);
    public abstract void IngresarSiClases(boolean C);
    public abstract void IngresarSiActividades(boolean A);
    public abstract void IngresarDiasLibres(String DL);
    public abstract void IngresarID_Semana(String IDS);
    
}
