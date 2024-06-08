import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    private Map <String, Integer> produkty = new HashMap<>();
    private Map <String, Integer> sklad = new HashMap<>();

    
    public int price(String product){
        return produkty.getOrDefault(product ,-99);
    }
    
    public int stock(String product){ 
        return sklad.getOrDefault(product, 0);
    }
    
    public void addProduct(String product, int price, int stock){
        this.produkty.put(product, price);
        this.sklad.put(product, stock);
    }
    
    public boolean take(String product){
        if(stock(product)>0){
            sklad.replace(product, sklad.get(product)-1);
            return true;
        }return false;
    }
    
    public Set<String> products(){
        Set set = produkty.keySet();
        
        return set;
    }
}
