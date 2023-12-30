/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

/**
 *
 * @author wiki
 */
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

 

import Model.Aeroport;
import java.sql.*;
import java.util.*;
import configs.Crude;
import javax.swing.*;


/**
 *
 * @author OMRANI
 */
public class AeroportControler {
 private Crude crude = new Crude();
 
    public boolean insert(Aeroport e) {
        //Check for unique login/pwd
        
        String sql =
                "INSERT INTO aeroport(nomaeroport, pays) VALUES ('"
                + e.getNomaeroport()+ "','"+e.getPays()+ "','" +  "')";
       System.out.println(sql);
        return crude.exeCreate(sql); 
    }

    public boolean update(Aeroport a, Integer id) {
        String sql =
                "UPDATE aeroport SET Nomaeroport='" + a.getNomaeroport() + "', Pays='"
                + a.getPays() + "' WHERE id=" + id;
        return crude.exeUpdate(sql);    
    }

    public boolean delete(Aeroport e) {
        String sql = "DELETE FROM aeroport WHERE id=" + e.getId();
        return crude.exeDelete(sql);    
    }

    public List<Aeroport> getAll() {
    try {
            String sql = "SELECT * FROM aeroport";
            ResultSet rs = crude.exeRead(sql);
            List<Aeroport> liste = new ArrayList<Aeroport>();
            while (rs.next()) {
                Aeroport aeroport = new Aeroport();
                aeroport.setId(rs.getInt(1));
                aeroport.setNomaeroport(rs.getString(2));
                aeroport.setPays(rs.getString(3));
               
                
                liste.add(aeroport);
            }
            return liste;
        } catch (SQLException ex) {
                System.err.println(ex.getMessage());
             JOptionPane.showMessageDialog(null, "Erreur AdministratorDAO ", "Erreur ", JOptionPane.ERROR_MESSAGE);

            return null;
        }
    }

    public Aeroport findByID(int id) {
        try {
            String sql = "SELECT * FROM administrator WHERE id = "+id;
            ResultSet rs = crude.exeRead(sql);
            Aeroport admin = new Aeroport();
            while (rs.next()) {
                admin.setId(rs.getInt(1));
                admin.setNomaeroport(rs.getString(2));
                admin.setPays(rs.getString(3));
                
            }
            return admin;
        } catch (SQLException ex) {
              System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur AdministratorDAO ", "Erreur ", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public Aeroport findBy(String nomaeroport, String pays){
        Aeroport aeroport = null;
        try {
            String sql = "SELECT * FROM aeroport WHERE nomaeroport = '"+nomaeroport+"' AND pays = '"+pays+"'";
            ResultSet rs = crude.exeRead(sql);
                while (rs.next()) {
                    aeroport = new Aeroport();
                    aeroport.setId(rs.getInt(1));
                    aeroport.setNomaeroport(rs.getString(2));
                    aeroport.setPays(rs.getString(3));
                    
                }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur AdministratorDAO ", "Erreur ", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return aeroport;
    }

}
