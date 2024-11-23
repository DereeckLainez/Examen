/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionMedicaDBLC;

/**
 *
 * @author deree
 */
public class PacienteDBLC extends PersonaDBLC
{
    private int numeroHistorialDL;
    private String EnfermedadDL;

    public PacienteDBLC(int numeroHistorialDL, String EnfermedadDL, String NombreDL, String EdadDL, String DireccionDL) {
        super(NombreDL, EdadDL, DireccionDL);
        this.numeroHistorialDL = numeroHistorialDL;
        this.EnfermedadDL = EnfermedadDL;
    }

    public int getNumeroHistorialDL() {
        return numeroHistorialDL;
    }

    public void setNumeroHistorialDL(int numeroHistorialDL) {
        this.numeroHistorialDL = numeroHistorialDL;
    }

    public String getEnfermedadDL() {
        return EnfermedadDL;
    }

    public void setEnfermedadDL(String EnfermedadDL) {
        this.EnfermedadDL = EnfermedadDL;
    }

   
}
