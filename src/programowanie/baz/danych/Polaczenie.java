/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programowanie.baz.danych;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lebko
 */
public class Polaczenie {
        public void polacz()  {
            try {
            // załadowanie sterownika
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            // utworzenie połączenia
            Connection polaczenie= DriverManager.getConnection
                            ("jdbc:sqlserver://pab-server.database.windows.net:1433;database=PAB2022;user=pab2022@pab-server;password=zaq1@WSX;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
            System.out.println("Działa");
            }
            catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Błąd "+e.getMessage(),
                    "Błąd programu",JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
            } 
        } 
    }
    
