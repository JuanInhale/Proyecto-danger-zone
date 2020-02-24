package proyect;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juan
 */
public abstract class ingreso {
    private String ID_ingresos;
    private String Descripcion;
    private String TipoDeIngresos;
    private Integer Valor;
    private String ID_Objetivos;

    public ingreso(String ID_ingresos, String Descripcion, String TipoDeIngresos, Integer Valor) {
        this.ID_ingresos = ID_ingresos;
        this.Descripcion = Descripcion;
        this.TipoDeIngresos = TipoDeIngresos;
        this.Valor = Valor;
    }

    public String getID_ingresos() {
        return ID_ingresos;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getTipoDeIngresos() {
        return TipoDeIngresos;
    }

    public Integer getValor() {
        return Valor;
    }

    public String getID_Objetivos() {
        return ID_Objetivos;
    }

    public void setID_ingresos(String ID_ingresos) {
        this.ID_ingresos = ID_ingresos;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setTipoDeIngresos(String TipoDeIngresos) {
        this.TipoDeIngresos = TipoDeIngresos;
    }

    public void setValor(Integer Valor) {
        this.Valor = Valor;
    }

    public void setID_Objetivos(String ID_Objetivos) {
        this.ID_Objetivos = ID_Objetivos;
    }

    
    
public abstract void Insertar_Ingresos(String Ingresos);
public abstract void Insertar_Descripcion(String Descripcion);
public abstract void Insertar_TipoDeIngresos(String TipoDeIngrsos);
public abstract void Insertar_Valor(String Valor);
public abstract void Insertar_ID_Objetivos(String ID_Objetivos);
}
