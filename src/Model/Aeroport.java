/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author wiki
 */

public class Aeroport {
    private Integer id;
    private String nomaeroport, pays;

    public Aeroport() {
    }

    public Aeroport(String nomaeroport, String pays) {        
        this.nomaeroport = nomaeroport;
        this.pays = pays;
        
    }
    
     public Aeroport(int id, String nomaeroport, String pays) { 
        this.id=id;
        this.nomaeroport = nomaeroport;
        this.pays = pays;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomaeroport() {
        return nomaeroport;
    }

    public void setNomaeroport(String nomaeroport) {
        this.nomaeroport = nomaeroport;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }


    @Override
    public String toString() {
        return "aeroport{" + "id=" + id + ", nomaeroport=" + nomaeroport + ", pays=" + pays +  '}';
    }
    
    
}
