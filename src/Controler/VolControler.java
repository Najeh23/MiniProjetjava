package Controler;



import Model.Vol;
import java.sql.*;
import java.util.*;
import configs.Crude;
import javax.swing.*;



public class VolControler {
    private Crude crude = new Crude();

    public boolean insert(Vol vol) {
        String sql = "INSERT INTO vol(AeroportDepart, AeroportArrivee, HeureDepart, HeureArrivee, DateDepart, DateArrivee) VALUES ('"
                + vol.getAeroportDepart() + "','" + vol.getAeroportArrivee() + "','" + vol.getHeureDepart() + "','" 
                + vol.getHeureArrivee() + "','" + vol.getDateDepart() + "','" + vol.getDateArrivee() + "')";
        System.out.println(sql);
        return crude.exeCreate(sql);
    }

    public boolean update(Vol vol, Integer id) {
        String sql = "UPDATE vol SET AeroportDepart='" + vol.getAeroportDepart() + "', AeroportArrivee='"
                + vol.getAeroportArrivee() + "' , HeureDepart= '" + vol.getHeureDepart() + "', HeureArrivee = '" 
                + vol.getHeureArrivee() + "', DateDepart = '" + vol.getDateDepart() + "', DateArrivee = '" 
                + vol.getDateArrivee() + "' WHERE id=" + id;
        return crude.exeUpdate(sql);
    }

    public boolean delete(Vol vol) {
        String sql = "DELETE FROM vol WHERE id=" + vol.getId();
        return crude.exeDelete(sql);
    }

    public List<Vol> getAll() {
        try {
            String sql = "SELECT * FROM vol";
            ResultSet rs = crude.exeRead(sql);
            List<Vol> liste = new ArrayList<Vol>();
            while (rs.next()) {
                Vol vol = new Vol();
                vol.setId(rs.getInt(1));
                vol.setAeroportDepart(rs.getString(2));
                vol.setAeroportArrivee(rs.getString(3));
                vol.setHeureDepart(rs.getString(4));
                vol.setHeureArrivee(rs.getString(5));
                vol.setDateDepart(rs.getString(6));
                vol.setDateArrivee(rs.getString(7));

                liste.add(vol);
            }
            return liste;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur VolControler ", "Erreur ", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public Vol findByID(int id) {
        try {
            String sql = "SELECT * FROM vol WHERE Id = " + id;
            ResultSet rs = crude.exeRead(sql);
            Vol vol = new Vol();
            while (rs.next()) {
                vol.setId(rs.getInt(1));
                vol.setAeroportDepart(rs.getString(2));
                vol.setAeroportArrivee(rs.getString(3));
                vol.setHeureDepart(rs.getString(4));
                vol.setHeureArrivee(rs.getString(5));
                vol.setDateDepart(rs.getString(6));
                vol.setDateArrivee(rs.getString(7));
            }
            return vol;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur VolControler ", "Erreur ", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public Vol findByAeroportsAndDates(String aeroportDepart, String aeroportArrivee, String dateDepart, String dateArrivee) {
        Vol vol = null;
        try {
            String sql = "SELECT * FROM vol WHERE AeroportDepart = '" + aeroportDepart + "' AND AeroportArrivee = '"
                    + aeroportArrivee + "' AND DateDepart = '" + dateDepart + "' AND DateArrivee = '" + dateArrivee + "'";
            ResultSet rs = crude.exeRead(sql);
            while (rs.next()) {
                vol = new Vol();
                vol.setId(rs.getInt(1));
                vol.setAeroportDepart(rs.getString(2));
                vol.setAeroportArrivee(rs.getString(3));
                vol.setHeureDepart(rs.getString(4));
                vol.setHeureArrivee(rs.getString(5));
                vol.setDateDepart(rs.getString(6));
                vol.setDateArrivee(rs.getString(7));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur VolControler ", "Erreur ", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return vol;
    }
}
