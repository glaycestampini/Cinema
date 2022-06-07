
package classes;

public class Venda {
    
    private int idVenda;
    private int ingresso;
    private double preco;
    private double total;
    private String dataVenda;
    private Sessao sessao;

    public Venda(int idVenda, int ingresso, double preco, double total, String dataVenda, Sessao sessao) {
        this.idVenda = idVenda;
        this.ingresso = ingresso;
        this.preco = preco;
        this.total = total;
        this.dataVenda = dataVenda;
        this.sessao = sessao;
    }

    public Venda() {
    }

    public Venda(Sessao sessao) {
        this.sessao = sessao;
    }



    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public int getIngresso() {
        return ingresso;
    }

    public void setIngresso(int ingresso) {
        this.ingresso = ingresso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
    

    
}
