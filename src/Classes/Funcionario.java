
package classes;


public class Funcionario  extends Usuario{
    
    
    //ATRIBUTO 
    private String telefone;
    private String endereço;
    private String ordemExibicao;

    //CONSTRUTOR 

    public Funcionario() {
    }

    
    //GET E SET 

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getOrdemExibicao() {
        return ordemExibicao;
    }

    public void setOrdemExibicao(String ordemExibicao) {
        this.ordemExibicao = ordemExibicao;
    }
    
    
    
    
}
