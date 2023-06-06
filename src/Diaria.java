public class Diaria extends Despesa {
    private double qtdeDiaria;

    @Override
    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    @Override
    public void setValorTotal(double valorTotal) {
        super.setValorTotal(valorTotal);
    }

    public double getQtdeDiaria() {
        return qtdeDiaria;
    }

    public void setQtdeDiaria(double qtdeDiaria) {
        this.qtdeDiaria = qtdeDiaria;
    }

    @Override
    void calcularDespesa() {
        setValorTotal(qtdeDiaria * 50);
    }

    @Override
    public void listarDespesa() {
        System.out.println(qtdeDiaria);
        ;
    }
}
