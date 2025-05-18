package Atividade01;

public final class Motocicleta extends Veiculo {
    private String tipoDeCombustivel;

    public Motocicleta(String modelo, String placa, int ano, double precoDiaria, String tipoDeCombustivel){
        super(modelo, placa, ano, precoDiaria);
        setTipoDeCombustivel(tipoDeCombustivel);
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        if (tipoDeCombustivel == null || tipoDeCombustivel.trim().isEmpty()) {
            System.out.println("Erro: Tipo de combustível não pode ser nulo ou vazio.");
        } else {
            this.tipoDeCombustivel = tipoDeCombustivel;
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("Atividade01.Motocicleta: Modelo= " + modelo +
                ", Placa= " + placa +
                ", Ano= " + ano +
                ", Preço Diária= " + precoDiaria +
                ", Tipo de Combustível= " + tipoDeCombustivel);
    }

    @Override
    public void calcularCusto(int dias) {
        if (dias < 0) {
            System.out.println("Quantidade de dias não pode ser negativa.");
        }
        if (dias > 10){
            System.out.println("O custo para "+ dias +" dia(s) com desconto de 5% é de: " + (precoDiaria * dias * 0.97));
        }else{
            System.out.println("o Custo total de "+ dias +" dia(s) é de: " + (precoDiaria * dias));
        }
    }
}

