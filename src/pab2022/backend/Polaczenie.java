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

/**
 *
 * @author Hubert
 */
public class Polaczenie {
    public void polaczeniedoserwera() throws  ClassNotFoundException{
    
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection p =
                    DriverManager.getConnection("jdbc:sqlserver://pab-server.database.windows.net:1433;database=PAB2022;user=pab2022;password=zaq1@WSX");
            
            PreparedStatement pytania = p.prepareStatement("{call dbo.pokaz_pytanie(1)}");
            ResultSet rezultatpytania = pytania.executeQuery();
            
            PreparedStatement odpowiedzi = p.prepareStatement("{call dbo.pokaz_odpowiedzi(1)}");
            ResultSet rezultatodpowiedzi = odpowiedzi.executeQuery();
            
            
            
            ArrayList lista = new ArrayList();
            
            
            while(rezultatpytania.next() ) {
                System.out.println(rezultatpytania.getString("pytanie"));
            }
            
            System.out.println(lista);

            p.close();
            }
        
        catch (SQLException ex) {
            Logger.getLogger(Polaczenie.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
