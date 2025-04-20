package main.java.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String descricao) {
        itemList.add(new Item(descricao));
    }

    public void removerItem(String descricao) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item item : itemList) {
            if (item.getDescricao().equalsIgnoreCase(descricao)) {
                itemsParaRemover.add(item);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }

    public int obterNumeroTotalItems() {
        return itemList.size();
    }

    public void obterDescricoesItem() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        System.out.println("O número total de itens é: " + carrinhoCompras.obterNumeroTotalItems());

        carrinhoCompras.adicionarItem("Cebola");
        carrinhoCompras.adicionarItem("Alface");
        carrinhoCompras.adicionarItem("Tomate");
        System.out.println("O número total de itens é: " + carrinhoCompras.obterNumeroTotalItems());

        carrinhoCompras.removerItem("Cebola");
        System.out.println("O número total de itens é: " + carrinhoCompras.obterNumeroTotalItems());

        carrinhoCompras.obterDescricoesItem();
    }

}
