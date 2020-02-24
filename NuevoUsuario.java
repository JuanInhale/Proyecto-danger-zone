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
public class NuevoUsuario extends Usuario{

    public NuevoUsuario(String Nombre, String Contrasenia, Integer Edad, String DNI, String ID_Usuario, String Fecha, String Email, char Sexo, String Telefono) {
        super(Nombre, Contrasenia, Edad, DNI, ID_Usuario, Fecha, Email, Sexo, Telefono);
    }
    
    
//Cargar datos
    @Override
    public void CargarNombre(String N) {
        super.Nombre = N;
    }

    @Override
    public void CargarSexo(char S) {
        super.Sexo = S;
    }

    @Override
    public void CargarEdad(Integer E) {
        super.Edad =E;
    }

    @Override
    public void CargarTelefono(String T) {
        super.Telefono = T;
    }

    @Override
    public void CargarEmail(String EM) {
        super.Email = EM;
    }

    @Override
    public void CargarDNI(String DN) {
        super.DNI = DN;
    }

    @Override
    public void CargarID_Usuario(String IDU) {
        super.ID_Usuario = IDU;
    }

    @Override
    public void CargarContrasenia(String C) {
        super.Contrasenia = C;
    }

    @Override
    public void CargarFecha(String F) {
        super.Fecha = F;
    }
    
}
