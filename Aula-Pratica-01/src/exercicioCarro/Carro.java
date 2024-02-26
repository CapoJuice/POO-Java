package exercicioCarro;
import java.util.Random;
public class Carro {
    
    String nome;
    String marca;
    int ano;
    int velo;

    public Carro(String nome, String marca, int ano, int velo) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.velo = velo;
    }

    void acelerar() {
        velo += 15;

    }

    void frear() {
        velo -= 10;
    }

    void manter(){
    }


    
    
}
