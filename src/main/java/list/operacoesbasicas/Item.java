package main.java.list.operacoesbasicas;

public class Item {
    private final String descricao;

    public Item(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Item{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
