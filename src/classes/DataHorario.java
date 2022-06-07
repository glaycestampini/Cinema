package classes;

import java.sql.Date;
import java.time.LocalDate;

/**
 *
 * @author GLAYC
 */
public class DataHorario {

private int idDataHorario;
private Date data;
private String horario;

    public DataHorario() {
    }

    public DataHorario(int idDataHorario, Date data, String horario) {
        this.idDataHorario = idDataHorario;
        this.data = data;
        this.horario = horario;
    }

    public int getIdDataHorario() {
        return idDataHorario;
    }

    public void setIdDataHorario(int idDataHorario) {
        this.idDataHorario = idDataHorario;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
