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
public abstract class Usuario {
    String Nombre;
    String Contrasenia;
    Integer Edad; 
    String DNI; 
    String ID_Usuario;
    String Fecha; 
    String Email;
    char Sexo;
    String Telefono;

    public Usuario(String Nombre, String Contrasenia, Integer Edad, String DNI, String ID_Usuario, String Fecha, String Email, char Sexo, String Telefono) {
        this.Nombre = Nombre;
        this.Contrasenia = Contrasenia;
        this.Edad = Edad;
        this.DNI = DNI;
        this.ID_Usuario = ID_Usuario;
        this.Fecha = Fecha;
        this.Email = Email;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContrasenia() {
        return Contrasenia;
    }

    public void setContrasenia(String Contrasenia) {
        this.Contrasenia = Contrasenia;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(String ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    public abstract void CargarNombre (String N);
    public abstract void CargarSexo(char S );
    public abstract void CargarEdad(Integer E);
    public abstract void CargarTelefono(String T);
    public abstract void CargarEmail(String EM);
    public abstract void CargarDNI(String DN);
    public abstract void CargarID_Usuario(String IDU);
    public abstract void CargarContrasenia(String C);
    public abstract void CargarFecha(String F);
    
}
