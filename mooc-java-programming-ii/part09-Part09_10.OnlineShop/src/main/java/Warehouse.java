
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dennis Mayer
 */
public class Warehouse {

    private Map<String, Integer> pricelist;
    private Map<String, Integer> stockL;

    public Warehouse() {
        this.pricelist = new HashMap<>();
        this.stockL = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        pricelist.putIfAbsent(product, price);
        stockL.putIfAbsent(product, stock);
    }

    public int price(String product) {
        if (!pricelist.containsKey(product)) {
            return -99;
        }
        return pricelist.get(product);
    }

    public int stock(String product) {
        if (!stockL.containsKey(product)) {
            return 0;
        }
        return stockL.get(product);
    }

    public boolean take(String product) {
        if (!stockL.containsKey(product)) {
            return false;
        }
        if (stockL.get(product) > 0) {
            stockL.put(product, stockL.get(product) - 1);
            return true;
        } else {
            return false;
        }
    }

    public Set<String> products(){
        return stockL.keySet();
    }
}
