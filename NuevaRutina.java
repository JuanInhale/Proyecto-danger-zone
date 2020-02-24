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
public class NuevaRutina extends Rutina {

    public NuevaRutina(String ID_Rutina, String Hobbies, String Trabajo, Integer HorasDeTrabajo, String ID_Semana, String ID_Objetivos) {
        super(ID_Rutina, Hobbies, Trabajo, HorasDeTrabajo, ID_Semana, ID_Objetivos);
    }

    @Override
    public void CargarHobbies(String HO) {
        super.Hobbies = HO;
    }

    @Override
    public void CargarTrabajo(String Tr) {
        super.Trabajo = Tr;
    }

    @Override
    public void CargarHoras(Integer HT) {
        super.HorasDeTrabajo = HT;
    }
    
    
}
