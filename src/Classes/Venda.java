
package Classes;

public class Venda {
    
    Filme objFilme = new Filme();
    
    
    
    //atributos
    private int id_venda;
    private int id_filme = objFilme.getId_filme();
    private int ingresso;
    private double preço;
    private double Total;

    //Construtor

    public Venda() {
    }
    
    
    
   //GET E SET 

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getId_filme() {
        return id_filme;
    }

    public void setId_filme(int id_filme) {
        this.id_filme = id_filme;
    }

    public int getIngresso() {
        return ingresso;
    }

    public void setIngresso(int ingresso) {
        this.ingresso = ingresso;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

 

   

    
    
    
    
}
