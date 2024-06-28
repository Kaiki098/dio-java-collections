package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String descricao) {
        carrinhoDeCompras.add(new Item(descricao));
    }

    public void removeItem(String descricao) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item item : carrinhoDeCompras) {
            if (item.getDescricao().equalsIgnoreCase(descricao)) {
                itemsParaRemover.add(item);
            }
        }
        carrinhoDeCompras.removeAll(itemsParaRemover);
    }

    public int obterNumeroTotalDeTarefas() {
        return carrinhoDeCompras.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras1 = new CarrinhoDeCompras();
        System.out.println(carrinhoDeCompras1.obterNumeroTotalDeTarefas());

        carrinhoDeCompras1.adicionarItem("item 1");
        System.out.println(carrinhoDeCompras1.obterNumeroTotalDeTarefas());

        carrinhoDeCompras1.adicionarItem("item 1");
        System.out.println(carrinhoDeCompras1.obterNumeroTotalDeTarefas());

        carrinhoDeCompras1.adicionarItem("item 1");
        System.out.println(carrinhoDeCompras1.obterNumeroTotalDeTarefas());
    }

}
