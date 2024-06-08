
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        // Test your app here
        Scanner scanner = new Scanner(System.in);
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("produkty", 5, 10);
        warehouse.addProduct("produkt", 45, 50);
        warehouse.addProduct("produkt", 45, 50);
        warehouse.addProduct("produkt", 45, 50);
        warehouse.addProduct("produkkkty", 50, 60);
        System.out.println(warehouse.price("produkty"));
        System.out.println(warehouse.stock("produkty"));
        
        System.out.println(warehouse.price("produkt"));
        System.out.println(warehouse.stock("produkt"));
        
        warehouse.take("produkty");
        
        System.out.println(warehouse.price("produkty"));
        System.out.println(warehouse.stock("produkty"));
        
        for(String i: warehouse.products()){
            System.out.println(i);
        }
        
        Item item = new Item("Mliko",2,8);
        System.out.println(item);
        
        ShoppingCart cart = new ShoppingCart();
        cart.add("Produkt", 500);
        cart.add("Dalsi", 1000);
        cart.add("Dalsi", 1000);
        cart.add("Dalsi", 1000);
        System.out.println(cart.price());
        
        cart.print();
        
        Store store = new Store(warehouse, scanner);
        store.shop("Vojta");
        
    }
}
