/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author GLAYC
 */
public class Assento {

    private int idAssento;
    private boolean ocupado;
    private Sala sala; 

    public Assento(int idAssento, boolean ocupado, Sala sala) {
        this.idAssento = idAssento;
        this.ocupado = ocupado;
        this.sala = sala;
    }

    public Assento(int id_assento) {
    }

    public int getIdAssento() {
        return idAssento;
    }

    public void setIdAssento(int idAssento) {
        this.idAssento = idAssento;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

   
}
