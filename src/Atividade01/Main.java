package Atividade01;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Hyundai Creta", "XYZ-123", 2025, 200.0, 4);
        carro.mostrarDados();
        carro.calcularCusto(30);

        System.out.println();

        Motocicleta moto = new Motocicleta("Yamaha MT-03", "XYZ-567", 2020, 50.0, "Gasolina");
        moto.mostrarDados();
        moto.calcularCusto(30);

        System.out.println();

        Carro carro2 = new Carro("Honda HR-V", "DEF-876", 2020, 300.0, 4);
        carro2.mostrarDados();
        carro2.calcularCusto(5);

        System.out.println();

        Motocicleta moto2 = new Motocicleta("Honda Sahara 300", "ABC-432", 2025, 150.0, "Gasolina");
        moto2.mostrarDados();
        moto2.calcularCusto(5);
    }
}