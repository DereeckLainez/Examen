package GestionMedicaDBLC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

/**
 *
 * @author deree
 */
public class PersonaDBLC
{
    private String NombreDL;
    private String EdadDL;
    private String DireccionDL;

    public PersonaDBLC(String NombreDL, String EdadDL, String DireccionDL) {
        this.NombreDL = NombreDL;
        this.EdadDL = EdadDL;
        this.DireccionDL = DireccionDL;
    }

    public String getNombreDL() {
        return NombreDL;
    }

    public void setNombreDL(String NombreDL) {
        this.NombreDL = NombreDL;
    }

    public String getEdadDL() {
        return EdadDL;
    }

    public void setEdadDL(String EdadDL) {
        this.EdadDL = EdadDL;
    }

    public String getDireccionDL() {
        return DireccionDL;
    }

    public void setDireccionDL(String DireccionDL) {
        this.DireccionDL = DireccionDL;
    }

    
}