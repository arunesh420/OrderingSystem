package model;

import java.util.ArrayList;

public class Order extends Category {
    String customer;
    int discount;
    String arrayList;
    int orderId;
    int totalAmmount;
    ArrayList<Items> item;

    public Order(String MainCategoryName, String category_name, String customer, int discount, String arrayList, int orderId, int totalAmmount, ArrayList<Items> item) {
        super(MainCategoryName, category_name);
        this.customer = customer;
        this.discount = discount;
        this.arrayList = arrayList;
        this.orderId = orderId;
        this.totalAmmount = totalAmmount;
        this.item = item;
    }

    public void order_Format(){
        System.out.println("***********************Bill***************************");
        System.out.println(this.customer);
        System.out.println("Main Category"+"  :"+this.MainCategoryName);
        System.out.println("Category"+"  :"+this.category_name);
        System.out.println("Items"+"  :"+this.arrayList);
    }
}
