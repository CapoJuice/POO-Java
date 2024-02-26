import java.util.ArrayList;

public class Inventario {
    
    private ArrayList<Item> itens;

    public Inventario() {
        itens = new ArrayList<>();
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    public void adicionarItem(String nome, int quantidade) {
        for (Item item : itens) {
            if (item.getNomeItem().equals(nome)) {
                item.setQuantidade(item.getQuantidade() + quantidade);

                System.out.println("Adicionados " + quantidade + " " + nome + "(s) ao inventário. Quantidade total: " + item.getQuantidade());
                return;
            }
        }
        itens.add(new Item(nome, quantidade));
        System.out.println("Item " + nome + " adicionado ao inventário com quantidade de " + quantidade + ".");
    }

    public void removerItem(String nome, int quantidade) {
        for (Item item : itens) {
            if (item.getNomeItem().equals(nome)) {
                if (quantidade >= item.getQuantidade()) {
                    itens.remove(item);

                    System.out.println("Foram removidos todos os " + quantidade + " " + nome + "(s) do inventário.");
                    
                } else {
                    item.setQuantidade(item.getQuantidade() - quantidade);

                    System.out.println("Foram removidos " + quantidade + " " + nome + "(s) do inventário. Quantidade restante: " + item.getQuantidade());
                    
                }
            }
        }
        System.out.println("Item " + nome + " não encontrado no inventário.");
        
    }

    public void exibirItens() {
        for (Item item : itens) {
            System.out.println(item.getNomeItem() + " - Quantidade: " + item.getQuantidade());
        }
    }
    

    
}
