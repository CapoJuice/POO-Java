public class Main {
    public static void main(String[] args) throws Exception {
        
        Personagem guerreiro = new Personagem("Guerreiro", 100, 20, 10); 

        Personagem monstro = new Personagem("Monstro", 80, 15, 5); 

        // Guerreiro ataca o monstro 

        guerreiro.atacar(monstro); 

        // Monstro ataca o guerreiro 

        monstro.atacar(guerreiro); 

        Inventario inventarioguerreiro = new Inventario();

        inventarioguerreiro.adicionarItem("cebola", 5);
        inventarioguerreiro.adicionarItem("espada grande", 5);
        inventarioguerreiro.adicionarItem("poçao vida", 5);

        inventarioguerreiro.exibirItens();





    
    }
}
