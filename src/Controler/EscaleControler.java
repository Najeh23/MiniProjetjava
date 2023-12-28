package Controler;



import Model.Escale;
import java.sql.*;
import java.util.*;
import configs.Crude;
import javax.swing.*;

public class EscaleControler {
    private Crude crude = new Crude();

    public boolean insert(Escale escale) {
        String sql = "INSERT INTO escale(NomAeroport, HeureDepart, HeureArrivee) VALUES ('"
                + escale.getNomAeroport() + "','" + escale.getHeureDepart() + "','" + escale.getHeureArrivee() + "')";
        System.out.println(sql);
        return crude.exeCreate(sql);
    }

    public boolean update(Escale escale, Integer id) {
        String sql = "UPDATE escale SET NomAeroport='" + escale.getNomAeroport() + "', HeureDepart='"
                + escale.getHeureDepart() + "' , HeureArrivee= '" + escale.getHeureArrivee() + "' WHERE id=" + id;
        return crude.exeUpdate(sql);
    }

    public boolean delete(Escale escale) {
        String sql = "DELETE FROM escale WHERE id=" + escale.getId();
        return crude.exeDelete(sql);
    }

    public List<Escale> getAll() {
        try {
            String sql = "SELECT * FROM escale";
            ResultSet rs = crude.exeRead(sql);
            List<Escale> liste = new ArrayList<Escale>();
            while (rs.next()) {
                Escale escale = new Escale();
                escale.setId(rs.getInt(1));
                escale.setNomAeroport(rs.getString(2));
                escale.setHeureDepart(rs.getString(3));
                escale.setHeureArrivee(rs.getString(4));

                liste.add(escale);
            }
            return liste;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur EscaleControler ", "Erreur ", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public Escale findByID(int id) {
        try {
            String sql = "SELECT * FROM escale WHERE Id = " + id;
            ResultSet rs = crude.exeRead(sql);
            Escale escale = new Escale();
            while (rs.next()) {
                escale.setId(rs.getInt(1));
                escale.setNomAeroport(rs.getString(2));
                escale.setHeureDepart(rs.getString(3));
                escale.setHeureArrivee(rs.getString(4));
            }
            return escale;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Erreur EscaleControler ", "Erreur ", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
