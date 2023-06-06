public abstract class Despesa {
    private String descricao;
    private double valorTotal;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void cadastrarDespesa(){
        System.out.println("Digite sua descricao: ");
        valorTotal = 0;
        descricao = "Itens";
    }

    abstract void calcularDespesa();

    abstract void listarDespesa();
}
