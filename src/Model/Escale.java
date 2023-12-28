/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author wiki
 */
public class Escale {
    private Integer id;
    private String NomAeroport;
    private String heureDepart;
    private String heureArrivee;
    
    public Escale(Integer id, String aeroport, String heureDepart, String heureArrivee) {
        this.id = id;
        this.NomAeroport = aeroport;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
    }

    public Escale(String aeroport, String heureDepart, String heureArrivee) {
        
        this.NomAeroport = aeroport;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
    }

    public Escale() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNomAeroport() {
        return NomAeroport;
    }

    public void setNomAeroport(String NomAeroport) {
        this.NomAeroport = NomAeroport;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public String getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(String heureArrivee) {
        this.heureArrivee = heureArrivee;
    }
    
       @Override
     public String toString() {
        return "Vol{" + "NomAeroport=" + NomAeroport +   ", heureDepart=" + heureDepart + ", heureArrivee=" + heureArrivee +  '}';
    }

    public void setId(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
