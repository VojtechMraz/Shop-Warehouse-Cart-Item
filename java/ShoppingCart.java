
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private Map<String, Item> cart;
    
    public ShoppingCart(){
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price){
        this.cart.putIfAbsent(product, new Item(product, 0, price));
        this.cart.get(product).increaseQuantity();
    }
    
    public int price(){
        int cena = 0;
        for(Item i: cart.values()){
            cena = cena + i.price();
        }
        return cena;
    }
    
    public void print(){
        for(Item i : cart.values()){
            System.out.println(i);
        }
    }
}
