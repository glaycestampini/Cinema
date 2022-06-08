package classes;

import java.time.LocalDate;
import java.util.Date;

public class DataHorario {

    private int idDataHorario;
    private String horario;
    private Date data;

    public DataHorario() {
    }

    public DataHorario(int id_dataHorario, Date data, String horario) {
        this.idDataHorario = id_dataHorario;
        this.horario = horario;
        this.data = data;
    }

    public int getIdDataHorario() {
        return idDataHorario;
    }

    public void setIdDataHorario(int idDataHorario) {
        this.idDataHorario = idDataHorario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
