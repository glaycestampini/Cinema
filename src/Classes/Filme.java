
package classes;


public class Filme {
    
    //ATRIBUTO 
    private int idFilme;
    private String nomeFilme;
    private String categoriaFilme;
    private String classificacaoFilme;
    private int duracaoFilme;
    private String dataFilme;
    private Double valorIngresso;

    public Filme(int idFilme, String nomeFilme, String categoriaFilme, String classificacaoFilme, int duracaoFilme, String dataFilme, Double valorIngresso) {
        this.idFilme = idFilme;
        this.nomeFilme = nomeFilme;
        this.categoriaFilme = categoriaFilme;
        this.classificacaoFilme = classificacaoFilme;
        this.duracaoFilme = duracaoFilme;
        this.dataFilme = dataFilme;
        this.valorIngresso = valorIngresso;
    }

    public Filme() {
    }

    public Filme(int id_filme) {
    }

    public Double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(Double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }


    public int getIdFilme() {
        return idFilme;
    }

    public void setIdFilme(int idFilme) {
        this.idFilme = idFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getCategoriaFilme() {
        return categoriaFilme;
    }

    public void setCategoriaFilme(String categoriaFilme) {
        this.categoriaFilme = categoriaFilme;
    }

    public String getClassificacaoFilme() {
        return classificacaoFilme;
    }

    public void setClassificacaoFilme(String classificacaoFilme) {
        this.classificacaoFilme = classificacaoFilme;
    }

    public int getDuracaoFilme() {
        return duracaoFilme;
    }

    public void setDuracaoFilme(int duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    public String getDataFilme() {
        return dataFilme;
    }

    public void setDataFilme(String dataFilme) {
        this.dataFilme = dataFilme;
    }

  

 
}
