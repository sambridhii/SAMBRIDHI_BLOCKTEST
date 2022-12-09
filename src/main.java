import model.Items;
import model.Orders;
import model.Users;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        //Items List
        ArrayList<Items> KunjalItems = new ArrayList<Items>();
        Items i1 = new Items("Skrit", 0001, "Zara", 2500, "Zara Store");
    KunjalItems.add(i1);
        Items i2 = new Items("t-shirt", 0002, "Essentials",2000, "Base Mark");
        ArrayList<Items> DiyaItems = new ArrayList<Items>();
        DiyaItems.add(i2);
        ArrayList<Items> OjuItems = new ArrayList<Items>();
        Items i3 = new Items("jacket", 0003, "Good American", 5000, "Forever 21");
        OjuItems.add(i3);
        ArrayList<Items> ToshItems = new ArrayList<Items>();
        Items i4 = new Items("pant", 0004, "Good American", 2000, "Sassy Lassy");
        ToshItems.add(i4);
        ArrayList<Items> ChaapeItems = new ArrayList<Items>();
        Items i5 = new Items("blazer", 0005, "Salt", 9000, "Anything");
        ChaapeItems.add(i5);

        //Orders List
        ArrayList<Orders> kunjalsOrder = new ArrayList<Orders>();
        Orders o1 = new Orders(KunjalItems, "Rs 6000", 1, "smth1", "STORE1", 1110);
        kunjalsOrder.add(o1);
        ArrayList<Orders> DiyasOrder = new ArrayList<Orders>();
        Orders o2 = new Orders(DiyaItems, "Rs 7000", 2,"Smth2", "STORE2", 1111);
        DiyasOrder.add(o2);
        ArrayList<Orders> ToshsOrder = new ArrayList<Orders>();
        Orders o3 = new Orders(DiyaItems, "Rs 8000", 2,"Smth3", "STORE3", 1112);
        DiyasOrder.add(o3);
        ArrayList<Orders> ChaapesOrder = new ArrayList<Orders>();
        Orders o4 = new Orders(DiyaItems, "Rs 9000", 2,"Smth4", "STORE4", 1113);
        DiyasOrder.add(o4);



        //Users List
        Users u1 = new Users(kunjalsOrder, 1, "Kunjal", "PINK", "skirt", 91);
        Users u2 = new Users(DiyasOrder,2, "Diya", "DARK PINK", "hoodie", 81);
        Users u3 = new Users(DiyasOrder,2, "Tosh", "DARK PINK", "hoodie", 81);
        Users u4 = new Users(DiyasOrder,2, "Chaape", "DARK PINK", "hoodie", 81);

        i1.getItem();
        i2.getItem();
        i3.getItem();
        i4.getItem();
        i5.getItem();
    }
}