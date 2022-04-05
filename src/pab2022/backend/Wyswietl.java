/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pab2022.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import pab2022.backend.Pytanie;

/**
 *
 * @author Hubert
 */
public class Wyswietl {
    public ArrayList wyswielpytania() throws ClassNotFoundException{
    try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection p =
                    DriverManager.getConnection("jdbc:sqlserver://pab-server.database.windows.net:1433;database=PAB2022;user=pab2022;password=zaq1@WSX");
            
            PreparedStatement skladnia = p.prepareStatement("{call dbo.pokaz_pytanie(1)}");
            ResultSet rezultatpytania = skladnia.executeQuery();
            
            ArrayList listapytan = new ArrayList();
           
            while(rezultatpytania.next()) {
                listapytan.add(new Pytanie(rezultatpytania.getInt("id"),
                    rezultatpytania.getString("pytanie")));}
               
            p.close();
            
            return listapytan;
            }
            
        
        catch (SQLException ex) {
            Logger.getLogger(Polaczenie.class.getName()).log(Level.SEVERE, null, ex);
        }
    return null;
    }
    
    public ArrayList wyswietlodpowiedzi() throws ClassNotFoundException{
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection p =
                    DriverManager.getConnection("jdbc:sqlserver://pab-server.database.windows.net:1433;database=PAB2022;user=pab2022;password=zaq1@WSX");

            PreparedStatement odpowiedzi = p.prepareStatement("{call dbo.pokaz_odpowiedzi(1)}");
            ResultSet rezultatodpowiedzi = odpowiedzi.executeQuery();
     
            ArrayList listaodpowiedzi = new ArrayList();
           
            while(rezultatodpowiedzi.next()){
                listaodpowiedzi.add(new Odpowiedz(rezultatodpowiedzi.getString("odpowiedz")));
            }           
            p.close();
            
             
            return listaodpowiedzi;
            }
            
        
        catch (SQLException ex) {
            Logger.getLogger(Polaczenie.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    
    }
    
    public Boolean sprawdzodpowiedz() {
        return null;
    }
    
}

