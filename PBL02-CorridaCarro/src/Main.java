import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Audi");
        Carro c2 = new Carro("BMW");
        Carro c3 = new Carro("Mercedes");

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println("Iteração " + (i + 1));

            if (c1.velocidade > 0 && c1.velocidade < 160) {
                int acaoC1 = rand.nextInt(3); // 0 para acelerar, 1 para frear, 2 para manter
                if (acaoC1 == 0) {
                    c1.acelerar();
                } else if (acaoC1 == 1) {
                    c1.frear();
                } else {
                    c1.manter();
                }
                System.out.println("Status de c1: " + c1.status());
            }

            if (c2.velocidade > 0 && c2.velocidade < 160) {
                int acaoC2 = rand.nextInt(3);
                if (acaoC2 == 0) {
                    c2.acelerar();
                } else if (acaoC2 == 1) {
                    c2.frear();
                } else {
                    c2.manter();
                }
                System.out.println("Status de c2: " + c2.status());
            }

            if (c3.velocidade > 0 && c3.velocidade < 160) {
                int acaoC3 = rand.nextInt(3);
                if (acaoC3 == 0) {
                    c3.acelerar();
                } else if (acaoC3 == 1) {
                    c3.frear();
                } else {
                    c3.manter();
                }
                System.out.println("Status de c3: " + c3.status());
            }

            System.out.println();

            try {
                Thread.sleep(3000); // Espera 3 segundos entre as iterações
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (c1.velocidade > c2.velocidade && c1.velocidade > c3.velocidade) {
            System.out.println("Audi Ganhou !!!");
        } else if (c2.velocidade > c1.velocidade && c2.velocidade > c3.velocidade) {
            System.out.println("BMW Ganhou !!!");
        }else {
            System.out.println("Mercedes Ganhou !!!");
        }

    }
}
