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
public abstract class gastos {
    private String ID_gastos;
    private String Tipo_de_gastos;
    private Integer DineroMinimoGastado;
    private String ID_Ingresos;

    public gastos(String ID_gastos, String Tipo_de_gastos, Integer DineroMinimoGastado, String ID_Ingresos) {
        this.ID_gastos = ID_gastos;
        this.Tipo_de_gastos = Tipo_de_gastos;
        this.DineroMinimoGastado = DineroMinimoGastado;
        this.ID_Ingresos = ID_Ingresos;
    }

    public String getID_gastos() {
        return ID_gastos;
    }

    public String getTipo_de_gastos() {
        return Tipo_de_gastos;
    }

    public Integer getDineroMinimoGastado() {
        return DineroMinimoGastado;
    }

    public String getID_Ingresos() {
        return ID_Ingresos;
    }

    public void setID_gastos(String ID_gastos) {
        this.ID_gastos = ID_gastos;
    }

    public void setTipo_de_gastos(String Tipo_de_gastos) {
        this.Tipo_de_gastos = Tipo_de_gastos;
    }

    public void setDineroMinimoGastado(Integer DineroMinimoGastado) {
        this.DineroMinimoGastado = DineroMinimoGastado;
    }

    public void setID_Ingresos(String ID_Ingresos) {
        this.ID_Ingresos = ID_Ingresos;
    }

public abstract void Insertar_ID_Gastos(String ID_Gastos);
public abstract void Insertar_Tipo_de_gastos(String Tipo_de_gastos);
public abstract void Insertar_Minimo_Gastado(String MinimoGastado);
public abstract void Insertar_Ingresos(String ID_Ingresos);
}
