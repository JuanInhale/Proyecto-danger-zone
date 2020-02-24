package proyect;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiago
 */

//Extends Semana, Objetivos
public abstract class Rutina {
    private String ID_Rutina;
    String Hobbies;
    String Trabajo;
    Integer HorasDeTrabajo;
    private String ID_Semana;
    private String ID_Objetivos;

    public Rutina(String ID_Rutina, String Hobbies, String Trabajo, Integer HorasDeTrabajo, String ID_Semana, String ID_Objetivos) {
        this.ID_Rutina = ID_Rutina;
        this.Hobbies = Hobbies;
        this.Trabajo = Trabajo;
        this.HorasDeTrabajo = HorasDeTrabajo;
        this.ID_Semana = ID_Semana;
        this.ID_Objetivos = ID_Objetivos;
    }

    public String getID_Rutina() {
        return ID_Rutina;
    }

    public void setID_Rutina(String ID_Rutina) {
        this.ID_Rutina = ID_Rutina;
    }

    public String getHobbies() {
        return Hobbies;
    }

    public void setHobbies(String Hobbies) {
        this.Hobbies = Hobbies;
    }

    public String getTrabajo() {
        return Trabajo;
    }

    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }

    public Integer getHorasDeTrabajo() {
        return HorasDeTrabajo;
    }

    public void setHorasDeTrabajo(Integer HorasDeTrabajo) {
        this.HorasDeTrabajo = HorasDeTrabajo;
    }

    public String getID_Semana() {
        return ID_Semana;
    }

    public void setID_Semana(String ID_Semana) {
        this.ID_Semana = ID_Semana;
    }

    public String getID_Objetivos() {
        return ID_Objetivos;
    }

    public void setID_Objetivos(String ID_Objetivos) {
        this.ID_Objetivos = ID_Objetivos;
    }
    
    
    public abstract void CargarHobbies (String HO);
    public abstract void CargarTrabajo (String Tr);
    public abstract void CargarHoras (Integer HT);
}
