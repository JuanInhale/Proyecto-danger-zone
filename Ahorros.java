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
//extends Ingresos
public abstract class Ahorros {
    String ID_Ahorros;
    String TipoDeSalario;
    private String ID_Ingresos;

    public Ahorros(String ID_Ahorros, String TipoDeSalario, String ID_Ingresos) {
        this.ID_Ahorros = ID_Ahorros;
        this.TipoDeSalario = TipoDeSalario;
        this.ID_Ingresos = ID_Ingresos;
    }

    public String getID_Ahorros() {
        return ID_Ahorros;
    }

    public void setID_Ahorros(String ID_Ahorros) {
        this.ID_Ahorros = ID_Ahorros;
    }

    public String getTipoDeSalario() {
        return TipoDeSalario;
    }

    public void setTipoDeSalario(String TipoDeSalario) {
        this.TipoDeSalario = TipoDeSalario;
    }

    public String getID_Ingresos() {
        return ID_Ingresos;
    }

    public void setID_Ingresos(String ID_Ingresos) {
        this.ID_Ingresos = ID_Ingresos;
    }
    
    public abstract void CargarID_Ahorros (String IDA);
    public abstract void CargarTipoDeSalario (String TDS);
    
}
