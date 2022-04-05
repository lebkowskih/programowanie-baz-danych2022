/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import pab2022.backend.Polaczenie;
import pab2022.backend.Wyswietl;
import pab2022.frontend.PAB2022Interface;


/**
 *
 * @author Hubert
 */
public class Main {
    public static void main(String[] args) throws ClassNotFoundException{
      
        
        PAB2022Interface pab2022=new PAB2022Interface();
        pab2022.setSize(400,400);
        pab2022.setTitle("UG - Milionerzy");
        pab2022.setVisible(true);
        
        
        Wyswietl wyswietl = new Wyswietl();
        wyswietl.wyswietlodpowiedzi();
        
        
        
    }
    
   
}
