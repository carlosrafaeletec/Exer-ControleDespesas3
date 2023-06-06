public class Principal {
    public static void main(String[] args) {
        Alimentacao refeicoes = new Alimentacao();
        Transporte veiculos = new Transporte();
        Diaria diarias = new Diaria();
        GerenciadorDespesas gerenciador = new GerenciadorDespesas();

        int op = 1;
        int op2 = 1;
            System.out.println("Escolha uma opcao: ");
            System.out.println("1 - Alimentacao");
            System.out.println("2 - Transporte");
            System.out.println("3 - Diaria");
            System.out.println("4 - Apresenta analise de despesas");
            System.out.println("0 - Sair\n");

            switch (op) {
                case 1:

                        System.out.println("Escolha seu método: ");
                        System.out.println("1 - Cadastrar despesa");
                        System.out.println("2 - Calcular despesa");
                        System.out.println("3 - Apresentar despesa");
                        System.out.println("4 - Incluir despesa para analise");
                        System.out.println("0 - Sair\n");

                        switch (op2) {
                            case 1:
                                refeicoes.cadastrarDespesa();

                            case 2:
                                refeicoes.calcularDespesa();

                            case 3:
                                refeicoes.listarDespesa();

                            case 4:
                                gerenciador.analisarDespesas(refeicoes);

                            case 0:
                                break;
                        }


                case 2:

                        System.out.println("Escolha seu método: ");
                        System.out.println("1 - Cadastrar despesa");
                        System.out.println("2 - Calcular despesa");
                        System.out.println("3 - Apresentar despesa");
                        System.out.println("4 - Incluir despesa para analise");
                        System.out.println("0 - Sair");

                        switch (op2) {
                            case 1:
                                veiculos.cadastrarDespesa();

                            case 2:
                                veiculos.calcularDespesa();

                            case 3:
                                veiculos.listarDespesa();

                            case 4:
                                gerenciador.analisarDespesas(veiculos);

                            case 0:
                                break;
                        }


                case 3:

                        System.out.println("Escolha seu método: ");
                        System.out.println("1 - Cadastrar despesa");
                        System.out.println("2 - Calcular despesa");
                        System.out.println("3 - Apresentar despesa");
                        System.out.println("4 - Incluir despesa para analise");
                        System.out.println("0 - Sair");

                        switch (op2) {
                            case 1:
                                diarias.cadastrarDespesa();

                            case 2:
                                diarias.calcularDespesa();

                            case 3:
                                diarias.listarDespesa();

                            case 4:
                                gerenciador.analisarDespesas(diarias);

                            case 0:
                                break;
                        }


                case 4:
                    System.out.println("Quantidade de Alimento:" + gerenciador.getQtdeAlimentacao());
                    System.out.println("Quantidade de Transporte:" + gerenciador.getQtdeTransporte());
                    System.out.println("Quantidade de Diaria:" + gerenciador.getQtdeDiaria());
                    System.out.println("Total de Alimentacao:" + gerenciador.getTotalAliemntacao());
                    System.out.println("Total de Transporte:" + gerenciador.getTotalTransporte());
                    System.out.println("Total de Diaria:" + gerenciador.getTotalDiaria());
                    System.out.println("Total de Despesas:" + gerenciador.getTotalDespesas());

                case 0:
                    break;
            }

    }
}
