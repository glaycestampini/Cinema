/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author GLAYC
 */
public class Sala {

private int idSala;
private int sala;

    public Sala(int idSala, int sala) {
        this.idSala = idSala;
        this.sala = sala;
    }

    public Sala() {
    }

    public Sala(int idSala) {
        this.idSala = idSala;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }
    

}
