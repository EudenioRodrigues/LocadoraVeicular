package Atividade01;

public final class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String modelo, String placa, int ano, double precoDiaria, int numeroDePortas) {
        super(modelo, placa, ano, precoDiaria);
        setNumeroDePortas(numeroDePortas);
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        if (numeroDePortas < 2 || numeroDePortas > 5) {
            System.out.println("Erro: Número de portas inválido. Deve ser entre 2 e 5.");
        } else {
            this.numeroDePortas = numeroDePortas;
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println( "Atividade01.Carro: " +
                "Modelo= " + modelo +
                ", Placa= " + placa +
                ", ano= " + ano +
                ", Preço da diária= " + precoDiaria +
                ", Número de portas= " + numeroDePortas);
    }

    @Override
    public void calcularCusto(int dias) {
        if (dias < 0) {
            System.out.println("Quantidade de dias não pode ser negativa.");
        }
        if (dias > 10){
            System.out.println("O custo para "+ dias +" dia(s) com desconto de 5% é de: R$ " + (precoDiaria * dias * 0.95));
        }else{
            System.out.println("o Custo total de "+ dias +" dia(s) é de: R$" + (precoDiaria * dias));
        }
    }
}

