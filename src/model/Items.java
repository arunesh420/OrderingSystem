package model;

public class Items extends Customer {
    String itemName;
    int itemPrice;

    public Items(String item_name, int item_price) {
        this.itemName = item_name;
        this.itemPrice = item_price;
    }
}
