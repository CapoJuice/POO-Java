public class Carro {

    String marca;
    int velocidade;

    Carro(String marca) {
        this.marca = marca;
        this.velocidade = 15;
    }

    void acelerar() {
        if (this.velocidade >= 0 && this.velocidade < 160) {
            this.velocidade += 15;
        }
    }

    void frear() {
        if (this.velocidade >= 10) {
            this.velocidade -= 10;
        } else {
            this.velocidade = 0;
        }
    }

    void manter() {
        // não faz nada, apenas mantém a velocidade
    }

    String status() {
        if (this.velocidade <= 0) {
            return "quebrou";
        } else if (this.velocidade >= 160) {
            return "capotou";
        } else {
            return Integer.toString(this.velocidade);
        }
    }
}

