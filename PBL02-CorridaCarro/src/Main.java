import java.util.Random;

public class Main {
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Audi");
        Carro c2 = new Carro("BMW");
        Carro c3 = new Carro("Mercedes");

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println("Iteração " + (i + 1));

            if (c1.velo > 0 && c1.velo < 160) {
                int acaoC1 = rand.nextInt(3);
                if (acaoC1 == 0) {
                    c1.acelerar();
                } else if (acaoC1 == 1) {
                    c1.frear();
                } else {
                    c1.manter();
                }
                System.out.println("Velocidade do Audi: " + c1.status() + " KM/h");
            }

            if (c2.velo > 0 && c2.velo < 160) {
                int acaoC2 = rand.nextInt(3);
                if (acaoC2 == 0) {
                    c2.acelerar();
                } else if (acaoC2 == 1) {
                    c2.frear();
                } else {
                    c2.manter();
                }
                System.out.println("Velocidade da BMW: " + c2.status() + " KM/h");
            }

            if (c3.velo > 0 && c3.velo < 160) {
                int acaoC3 = rand.nextInt(3);
                if (acaoC3 == 0) {
                    c3.acelerar();
                } else if (acaoC3 == 1) {
                    c3.frear();
                } else {
                    c3.manter();
                }
                System.out.println("Velocidade da Mercedes: " + c3.status() + " KM/h");
            }

            System.out.println();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (c1.velo > c2.velo && c1.velo > c3.velo) {
            System.out.println("Audi Ganhou !!!");
        } else if (c2.velo > c1.velo && c2.velo > c3.velo) {
            System.out.println("BMW Ganhou !!!");
        }else {
            System.out.println("Mercedes Ganhou !!!");
        }

    }
}
