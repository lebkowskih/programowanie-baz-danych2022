/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pab2022.backend;

/**
 *
 * @author Hubert
 */
public class Pytanie {
    private int id;
    private String pytanie;
    
    public Pytanie(int id,String pytanie){
        this.id = id;
        this.pytanie = pytanie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPytanie() {
        return pytanie;
    }

    public void setPytanie(String pytanie) {
        this.pytanie = pytanie;
    }
}
