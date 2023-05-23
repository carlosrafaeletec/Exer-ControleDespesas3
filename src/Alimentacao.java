public class Alimentacao extends Despesa {

    private String nomeRestaurante;
    private int qtdeRefeições;

    @Override
    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    @Override
    public void setValorTotal(double valorTotal) {
        super.setValorTotal(valorTotal);
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public void calcularDespesa(){
        setValorTotal(qtdeRefeições * 18);
    }

    public void cadastrarDespesa(){
        setValorTotal(0);
    }

    @Override
    public void listarDespesa() {
        listarDespesa();
    }
}
