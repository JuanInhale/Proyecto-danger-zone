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
public abstract class Calendario {
    
    Integer FechaHoy;
    Integer FechaMarcada;
    Integer FechaLimite;
    String ID_Calendario;

    public Calendario(Integer FechaHoy, Integer FechaMarcada, Integer FechaLimite, String ID_Calendario) {
        this.FechaHoy = FechaHoy;
        this.FechaMarcada = FechaMarcada;
        this.FechaLimite = FechaLimite;
        this.ID_Calendario = ID_Calendario;
    }

    public Integer getFechaHoy() {
        return FechaHoy;
    }

    public void setFechaHoy(Integer FechaHoy) {
        this.FechaHoy = FechaHoy;
    }

    public Integer getFechaMarcada() {
        return FechaMarcada;
    }

    public void setFechaMarcada(Integer FechaMarcada) {
        this.FechaMarcada = FechaMarcada;
    }

    public Integer getFechaLimite() {
        return FechaLimite;
    }

    public void setFechaLimite(Integer FechaLimite) {
        this.FechaLimite = FechaLimite;
    }

    public String getID_Calendario() {
        return ID_Calendario;
    }

    public void setID_Calendario(String ID_Calendario) {
        this.ID_Calendario = ID_Calendario;
    }
    
    public abstract void CargarFechaHoy (Integer FH);
    public abstract void CargarFechaMarcada (Integer FM);
    public abstract void CargarFechaLimite (Integer FL);
    public abstract void CargarIDC (String IDC);
    
}
