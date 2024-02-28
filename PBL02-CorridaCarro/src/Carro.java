public class Carro {

    String marca;
    int velo;

    Carro(String marca) {
        this.marca = marca;
        this.velo = 15;
    }

    void acelerar() {
        if (this.velo >= 0 && this.velo < 160) {
            this.velo += 15;
        }
    }

    void frear() {
        if (this.velo >= 10) {
            this.velo -= 10;
        } else {
            this.velo = 0;
        }
    }

    void manter() {
    }

    String status() {
        if (this.velo <= 0) {
            return "quebrou";
        } else if (this.velo >= 160) {
            return "capotou";
        } else {
            return Integer.toString(this.velo);
        }
    }
}

