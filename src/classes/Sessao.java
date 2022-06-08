package classes;

public class Sessao {

    private int idSessao;
    private Sala sala;
    private Assento assento;
    private DataHorario dataHorario;
    private Filme filme;

    public Sessao() {
    }

    public Sessao(int idSessao, Sala sala, Assento assento, DataHorario dataHorario, Filme filme) {
        this.idSessao = idSessao;
        this.sala = sala;
        this.assento = assento;
        this.dataHorario = dataHorario;
        this.filme = filme;
    }

    public Sessao(int id_sessao) {
    }

    public int getIdSessao(){
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

    public DataHorario getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(DataHorario dataHorario) {
        this.dataHorario = dataHorario;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
}
