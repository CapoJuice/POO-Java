public class Main {
    public static void main(String[] args) {
        
        Carro c1 = new Carro();

        c1.nome = "RS6 Avant";
        c1.marca = "Audi";
        c1.ano = 2024;
        c1.velo = 80;

        System.out.println("Velocidade " + c1.velo + " Km/h");

        c1.acelerar(220);

        System.out.println("Velocidade " + c1.velo + " Km/h");

        c1.frear(160);

        System.out.println("Velocidade " + c1.velo + " Km/h");

    }
}
