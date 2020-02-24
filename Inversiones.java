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

//extends Ingresos;
public abstract class Inversiones {
    String ID_Inversiones;
    private String ID_Ingresos; 

    public Inversiones(String ID_Inversiones, String ID_Ingresos) {
        this.ID_Inversiones = ID_Inversiones;
        this.ID_Ingresos = ID_Ingresos;
    }

    public String getID_Inversiones() {
        return ID_Inversiones;
    }

    public String getID_Ingresos() {
        return ID_Ingresos;
    }

    public void setID_Inversiones(String ID_Inversiones) {
        this.ID_Inversiones = ID_Inversiones;
    }

    public void setID_Ingresos(String ID_Ingresos) {
        this.ID_Ingresos = ID_Ingresos;
    }
    
    
        public abstract void CargarID(String I);
    
}
