
package Classes;

public class Usuario {
    
  //ATRIBUTO 
    
    private int id;
    private String login;
    private String nome;
    private String senha;
    private String cargo;

    //CONSTRUTOR 
      public Usuario() {
    }
      
      
    //GET E SET

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    
    
    
    
}
