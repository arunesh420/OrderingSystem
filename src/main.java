import model.Items;
import model.Order;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Items> item =new ArrayList<>();
        Items csm1=new Items("roll",150);
        Items csm2=new Items("sizzler",550);
        Items csm3=new Items("cake",100);

        item.add(csm1);
        item.add(csm2);
        item.add(csm3);
Order order1=new Order("Lunch","roll","Depak",16, "item",321,34,item);
order1.order_Format();
    }
}
