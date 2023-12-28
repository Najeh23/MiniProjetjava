/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;



/**
 *
 * @author omrani
 */

public class Vol {
    private Integer id;
    private String aeroportDepart, aeroportArrivee,
       heureDepart, heureArrivee,
       dateDepart, dateArrivee;
    List< Escale> escales;

    public Vol() {
    }

    public Vol(String aeroportDepart, String aeroportArrivee, String heureDepart, String heureArrivee , String dateDepart, String dateArrivee , List<Escale> escales) {        
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.escales = escales;
    }
    
    public Vol(Integer id, String aeroportDepart, String aeroportArrivee, String heureDepart,String heureArrivee , String dateDepart, String dateArrivee , List<Escale> escales ) {
        this.id = id;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.escales = escales;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAeroportDepart() {
        return aeroportDepart;
    }

    public void setAeroportDepart(String aeroportDepart) {
        this.aeroportDepart = aeroportDepart;
    }

    public String getAeroportArrivee() {
        return aeroportArrivee;
    }

    public void setAeroportArrivee(String aeroportArrivee) {
        this.aeroportArrivee = aeroportArrivee;
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

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(String dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public List<Escale> getEscales() {
        return escales;
    }

    public void setEscales(List<Escale> escales) {
        this.escales = escales;
    }

   

    @Override
    public String toString() {
        return "Vol{" + "id=" + id + ", aeroportDepart=" + aeroportDepart + ", aeroportArrivee=" + aeroportArrivee + ", heureDepart=" + heureDepart + ", heureArrivee=" + heureArrivee + "dateDepart=" + dateDepart + ", dateArrivee=" + dateArrivee + ", escales=" + escales + '}';
    }

    
    
    
}
