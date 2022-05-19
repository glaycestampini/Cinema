
package Classes;

public class Filme {
    
    //ATRIBUTO 
    private int id_filme;
    private String nome_filme;
    private String categoria_filme;
    private String classificaçao_filme;
    private String sala_filme;
    private String sessao_filme;

    //CONSTRUTOR 

    public Filme() {
    }
    
    
    //GET E SET 

    public int getId_filme() {
        return id_filme;
    }

    public void setId_filme(int id_filme) {
        this.id_filme = id_filme;
    }

    public String getNome_filme() {
        return nome_filme;
    }

    public void setNome_filme(String nome_filme) {
        this.nome_filme = nome_filme;
    }

    public String getCategoria_filme() {
        return categoria_filme;
    }

    public void setCategoria_filme(String categoria_filme) {
        this.categoria_filme = categoria_filme;
    }

    public String getClassificaçao_filme() {
        return classificaçao_filme;
    }

    public void setClassificaçao_filme(String classificaçao_filme) {
        this.classificaçao_filme = classificaçao_filme;
    }

    public String getSala_filme() {
        return sala_filme;
    }

    public void setSala_filme(String sala_filme) {
        this.sala_filme = sala_filme;
    }

    public String getSessao_filme() {
        return sessao_filme;
    }

    public void setSessao_filme(String sessao_filme) {
        this.sessao_filme = sessao_filme;
    }
    
    
    
}
