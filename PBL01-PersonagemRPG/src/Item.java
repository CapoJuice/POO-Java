public class Item {
    
    private String nomeItem;
    private int quantidade;

    public Item(String nomeItem, int quantidade) {
        this.nomeItem = nomeItem;
        this.quantidade = quantidade;
    }

    public String getNomeItem() {
        return nomeItem;
    }

    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    

}
