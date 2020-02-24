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
public class NuevaSemana extends Semana{

    public NuevaSemana(String DiasLaborales, String DiaDeClases, String DiasDeActividades, boolean Laborales, boolean Clases, boolean Actividades, String DiasLibres, String ID_Semana, String ID_Calendario) {
        super(DiasLaborales, DiaDeClases, DiasDeActividades, Laborales, Clases, Actividades, DiasLibres, ID_Semana, ID_Calendario);
    }
    
    

    @Override
    public void IngresarDiasLaborales(String DL) {
        super.DiasLaborales = DL;
    }

    @Override
    public void ingresarDiasDeClases(String DDC) {
        super.DiaDeClases = DDC;
    }

    @Override
    public void IngresarDiasDeActividades(String DDA) {
        super.DiasDeActividades = DDA;
    }

    @Override
    public void IngresarSiLabura(boolean L) {
        super.Laborales = L;
    }

    @Override
    public void IngresarSiClases(boolean C) {
        super.Clases = C;
    }

    @Override
    public void IngresarSiActividades(boolean A) {
        super.Actividades = A;
    }

    @Override
    public void IngresarDiasLibres(String DL) {
        super.DiasLibres = DL;
    }

    @Override
    public void IngresarID_Semana(String IDS) {
        super.ID_Semana = IDS;
    }
    
    
    
}
