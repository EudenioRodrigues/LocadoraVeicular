package Trabalho01;

public abstract class Curso {
    protected String titulo;
    protected String instrutor;
    protected int cargaHoraria;
    protected double precoPorHora;

    public Curso(String titulo, String instrutor, int cargaHoraria, double precoPorHora) {
        setTitulo(titulo);
        setInstrutor(instrutor);
        setCargaHoraria(cargaHoraria);
        setPrecoPorHora(precoPorHora);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            System.out.println("Erro: Título não pode ser nulo ou vazio.");
        }
        this.titulo = titulo;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        if (instrutor == null || instrutor.trim().isEmpty()) {
            System.out.println("Erro: Instrutor não pode ser nulo ou vazio.");
        }
        this.instrutor = instrutor;
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        if (cargaHoraria <= 0) {
            System.out.println("Erro: Carga horária deve ser maior que zero.");
        }
        this.cargaHoraria = cargaHoraria;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        if (precoPorHora <= 0) {
            System.out.println("Erro: Preço por hora deve ser maior que zero.");
        }
        this.precoPorHora = precoPorHora;
    }

    public abstract void mostrarDados();
    public abstract double calcularCusto();
    public abstract void gerarRelatorio();
}
