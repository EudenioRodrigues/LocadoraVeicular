package Trabalho01;

public final class CursoDeDesign extends Curso {
    private String ferramenta;

    public CursoDeDesign(String titulo, String instrutor, int cargaHoraria, double precoPorHora, String ferramenta) {
        super(titulo, instrutor, cargaHoraria, precoPorHora);
        setFerramenta(ferramenta);
    }

    public String getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(String ferramenta) {
        if (ferramenta == null || ferramenta.trim().isEmpty()) {
            System.out.println("Erro: Ferramenta não pode ser nula ou vazia.");
        }
        this.ferramenta = ferramenta;
    }

    @Override
    public void mostrarDados(){
        System.out.println("==============================Cadastro do curso==============================");
        System.out.println("Título: " + getTitulo());
        System.out.println("Tipo: Design");
        System.out.println("Ferramenta: " + getFerramenta());
        System.out.println("Carga Horária: " + getCargaHoraria() + " horas");
        System.out.println("Preço por Hora: R$ " + getPrecoPorHora());
        double custoTotal = calcularCusto();
        if (getCargaHoraria() < 20) {
            System.out.println("Custo total do curso com 5% de desconto: R$ " + custoTotal);
        } else {
            System.out.println("Custo total do curso: R$ " + custoTotal);
        }
        System.out.println("=============================================================================");
    }

    @Override
    public double calcularCusto(){
        if (cargaHoraria < 20){
            return cargaHoraria * precoPorHora * 0.95;
        } else {
            return cargaHoraria * precoPorHora;
        }
    }

    @Override
    public void gerarRelatorio(){
        System.out.println("==============================Relatório do curso==============================");
        System.out.println("Título: " + getTitulo());
        System.out.println("Instrutor: " + getInstrutor());
        System.out.println("Ferramenta: " + getFerramenta());
        System.out.println("Carga Horária: " + getCargaHoraria() + " horas");
        double custoTotal = calcularCusto();
        if (getCargaHoraria() < 20) {
            System.out.println("Custo total do curso com 5% de desconto: R$ " + custoTotal);
        } else {
            System.out.println("Custo total do curso: R$ " + custoTotal);
        }
        System.out.println("=============================================================================");
    }
}
