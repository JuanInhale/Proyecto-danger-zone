/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author tiago
 */
public class NuevoCalendario extends Calendario{

    public NuevoCalendario(Integer FechaHoy, Integer FechaMarcada, Integer FechaLimite, String ID_Calendario) {
        super(FechaHoy, FechaMarcada, FechaLimite, ID_Calendario);
    }

    @Override
    public void CargarFechaHoy(Integer FH) {
        super.FechaHoy = FH;
    }

    @Override
    public void CargarFechaMarcada(Integer FM) {
        super.FechaMarcada = FM;
    }

    @Override
    public void CargarFechaLimite(Integer FL) {
        super.FechaLimite = FL;
    }

    @Override
    public void CargarIDC(String IDC) {
        super.ID_Calendario = IDC;
    }
    
    
}
