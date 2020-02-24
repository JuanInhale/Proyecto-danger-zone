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
public class NuevaInversion extends Inversiones{

    public NuevaInversion(String ID_Inversiones, String ID_Ingresos) {
        super(ID_Inversiones, ID_Ingresos);
    }
    
    @Override
    public void CargarID(String I) {
        super.ID_Inversiones = I;
    }
    
}
