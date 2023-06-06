public class GerenciadorDespesas{
    private int qtdeAlimentacao;
    private int qtdeTransporte;
    private int qtdeDiaria;
    private double totalAlimentacao;
    private double totalTransporte;
    private double totalDiaria;
    private double totalDespesas;

    public int getQtdeAlimentacao() {
        return qtdeAlimentacao;
    }

    public void setQtdeAlimentacao(int qtdeAlimentacao) {
        this.qtdeAlimentacao = qtdeAlimentacao;
    }

    public int getQtdeTransporte() {
        return qtdeTransporte;
    }

    public void setQtdeTransporte(int qtdeTransporte) {
        this.qtdeTransporte = qtdeTransporte;
    }

    public int getQtdeDiaria() {
        return qtdeDiaria;
    }

    public void setQtdeDiaria(int qtdeDiaria) {
        this.qtdeDiaria = qtdeDiaria;
    }

    public double getTotalAliemntacao() {
        return totalAlimentacao;
    }

    public void setTotalAliemntacao(double totalAliemntacao) {
        this.totalAlimentacao = totalAliemntacao;
    }

    public double getTotalTransporte() {
        return totalTransporte;
    }

    public void setTotalTransporte(double totalTransporte) {
        this.totalTransporte = totalTransporte;
    }

    public double getTotalDiaria() {
        return totalDiaria;
    }

    public void setTotalDiaria(double totalDiaria) {
        this.totalDiaria = totalDiaria;
    }

    public double getTotalDespesas() {
        return totalDespesas;
    }

    public void setTotalDespesas(double totalDespesas) {
        this.totalDespesas = totalDespesas;
    }

    public void analisarDespesas(Despesa despesa){
        if(despesa instanceof Alimentacao) {
            totalDespesas += despesa.getValorTotal();
            totalAlimentacao += despesa.getValorTotal();
            qtdeAlimentacao += 1;
        }

        if(despesa instanceof Transporte) {
            totalDespesas += despesa.getValorTotal();
            totalTransporte += despesa.getValorTotal();
            qtdeTransporte += 1;
        }

        if(despesa instanceof Diaria){
            totalDespesas += despesa.getValorTotal();
            totalDiaria += despesa.getValorTotal();
            qtdeDiaria += 1;
        }



    }

}
