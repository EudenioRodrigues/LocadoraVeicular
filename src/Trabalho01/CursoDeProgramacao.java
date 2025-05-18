package Trabalho01;

public final class CursoDeProgramacao extends Curso{
    private String linguagem;

    public CursoDeProgramacao(String titulo, String instrutor, int cargaHoraria, double precoPorHora, String linguagem) {
        super(titulo, instrutor, cargaHoraria, precoPorHora);
        setLinguagem(linguagem);
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        if (linguagem == null || linguagem.trim().isEmpty()) {
            System.out.println("Erro: Linguagem não pode ser nula ou vazia.");
        }
        this.linguagem = linguagem;
    }

    @Override
    public void mostrarDados(){
        System.out.println("==============================Cadastro do curso==============================");
        System.out.println("Título: " + getTitulo());
        System.out.println("Tipo: Programação");
        System.out.println("Linguagem: " + getLinguagem());
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
        if (cargaHoraria > 50){
            return cargaHoraria * precoPorHora * 0.9;
        } else {
            return cargaHoraria * precoPorHora;
        }
    }

    @Override
    public void gerarRelatorio(){
        System.out.println("==============================Relatório do curso==============================");
        System.out.println("Título: " + getTitulo());
        System.out.println("Instrutor: " + getInstrutor());
        System.out.println("Linguagem: " + getLinguagem());
        System.out.println("Carga Horária: " + getCargaHoraria() + " horas");
        double custo = calcularCusto();
        if (getCargaHoraria() > 50) {
            System.out.println("Custo total do curso com 10% de desconto: R$ " + custo);
        } else {
            System.out.println("Custo total do curso: R$ " + custo);
        }
        System.out.println("==============================================================================");
    }
}

