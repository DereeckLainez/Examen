/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionMedicaDBLC;

/**
 *
 * @author deree
 */
public class MedicoDBLC extends PersonaDBLC{
    
    private String EspecialidadDL;
    private int AnioExperienciaDL;

    public MedicoDBLC(String EspecialidadDL, String NombreDL, String DireccionDL, String EdadDL, String text4) {
        super(NombreDL, EdadDL, DireccionDL);
        this.EspecialidadDL = EspecialidadDL;
        this.AnioExperienciaDL = AnioExperienciaDL;
    }

    public String getEspecialidadDL() {
        return EspecialidadDL;
    }

    public void setEspecialidadDL(String EspecialidadDL) {
        this.EspecialidadDL = EspecialidadDL;
    }

    public int getAnioExperienciaDL() {
        return AnioExperienciaDL;
    }

    public void setAnioExperienciaDL(int AnioExperienciaDL) {
        this.AnioExperienciaDL = AnioExperienciaDL;
    }
    

}