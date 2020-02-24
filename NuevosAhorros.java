/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

/**
 *
 * @author tiago
 */
public class NuevosAhorros extends Ahorros {

    public NuevosAhorros(String ID_Ahorros, String TipoDeSalario, String ID_Ingresos) {
        super(ID_Ahorros, TipoDeSalario, ID_Ingresos);
    }
    
    

    @Override
    public void CargarID_Ahorros(String IDA) {
        super.ID_Ahorros = IDA;
    }

    @Override
    public void CargarTipoDeSalario(String TDS) {
        super.TipoDeSalario = TDS;
    }
    
}
