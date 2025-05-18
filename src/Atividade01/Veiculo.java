package Atividade01;

public abstract class Veiculo {
    protected String modelo;
    protected String placa;
    protected int ano;
    protected double precoDiaria;

    public Veiculo(String modelo, String placa, int ano, double precoDiaria) {
        setModelo(modelo);
        setPlaca(placa);
        setAno(ano);
        setPrecoDiaria(precoDiaria);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            System.out.println("Erro: Modelo não pode ser nulo ou vazio.");
        } else {
            this.modelo = modelo;
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        if (placa == null || placa.length() != 7) {
            System.out.println("Erro: Placa inválida. Deve ter 7 caracteres.");
        } else {
            this.placa = placa;
        }
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano < 1950 || ano > 2025) {
            System.out.println("Erro: Ano inválido. Insira um ano entre 1950 e 2025.");
        } else {
            this.ano = ano;
        }
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        if (precoDiaria < 0) {
            System.out.println("Erro: Preço inválido. Deve ser maior que zero.");
        } else {
            this.precoDiaria = precoDiaria;
        }
    }

    public abstract void mostrarDados();
    public abstract void calcularCusto(int dias);

}
