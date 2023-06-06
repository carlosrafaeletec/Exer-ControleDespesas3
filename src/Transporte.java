public class Transporte extends Despesa {
    private double kmPercorrida;
    private double valorPedagios;

    @Override
    public void setDescricao(String descricao) {
        super.setDescricao(descricao);
    }

    @Override
    public void setValorTotal(double valorTotal) {
        super.setValorTotal(valorTotal);
    }

    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorPedagios() {
        return valorPedagios;
    }

    public void setValorPedagios(double valorPedagios) {
        this.valorPedagios = valorPedagios;
    }

    public void calcularDespesa(){
        setValorTotal((kmPercorrida * 3) + valorPedagios);
    }

    @Override
    public void listarDespesa() {
        System.out.println(kmPercorrida);
        System.out.println(valorPedagios);
    }
}
