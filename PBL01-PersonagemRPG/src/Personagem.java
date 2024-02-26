public class Personagem {

    private String nome;
    private int pontosDeVida;
    private int ataque;
    private int defesa;

    public Personagem(String nome, int pontosDeVida, int ataque, int defesa) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }

    public void setPontosDeVida(int pontosDeVida) {
        this.pontosDeVida = pontosDeVida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    //Método para o personagem causar dano
    public void atacar(Personagem alvo) {

        int danoCausado = this.ataque - alvo.defesa;

        if (danoCausado > 0) {
            System.out.println(this.nome + " atacou " + alvo.nome + " causando " + danoCausado + " de dano.");

            alvo.receberDano(danoCausado);

        }else{
            System.out.println("atacou " + alvo.nome + ", mas o ataque foi bloqueado!");
        }
    }

    //Método para o personagem receber dano
    public void receberDano(int dano) {

        this.pontosDeVida -= dano;
        
        if(this.pontosDeVida <= 0) {
            System.out.println(this.nome + " foi derrotado!");

        }else{
            System.out.println(this.nome + " recebeu " + dano + " de dano. Pontos de vida restantes: " + this.pontosDeVida);
        }
    }

    
}
