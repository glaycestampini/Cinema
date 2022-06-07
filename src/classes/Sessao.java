/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author GLAYC
 */
public class Sessao {

    private int idSessao;
    private Sala sala;
    private Assento assento;
    private Filme filme;
    private DataHorario dataHorario;

    public Sessao(int idSessao, Sala sala, Assento assento, Filme filme, DataHorario dataHorario) {
        this.idSessao = idSessao;
        this.sala = sala;
        this.assento = assento;
        this.filme = filme;
        this.dataHorario = dataHorario;
    }

    public Sessao() {
    }

    public Sessao(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }



    public int getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public DataHorario getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(DataHorario dataHorario) {
        this.dataHorario = dataHorario;
    }


    
}
