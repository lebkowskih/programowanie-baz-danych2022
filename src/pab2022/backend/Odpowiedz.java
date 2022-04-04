/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pab2022.backend;

/**
 *
 * @author Hubert
 */
public class Odpowiedz {
    private int id;
    private String odpowiedz;
    
    public Odpowiedz(int id,String odpowiedz){
        this.id = id;
        this.odpowiedz = odpowiedz;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOdpowiedz() {
        return odpowiedz;
    }

    public void setOdpowiedz(String odpowiedz) {
        this.odpowiedz = odpowiedz;
    }
}
