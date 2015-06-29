/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day9plus1;




/**
 *
 * @author Amilo
 */
public class Storage {
    
    int id;
    String description;
    int priceR;
    int priceO;
    String warranty;

    public Storage(int id, String description, int priceR, int priceO, String warranty) {
        this.id = id;
        this.description = description;
        this.priceR = priceR;
        this.priceO = priceO;
        this.warranty = warranty;
        
        
    }

    @Override
    public String toString() {
        return "Storage{" + "id=" + id + ", description=" + description + ", priceR=" + priceR + ", priceO=" + priceO + ", warranty=" + warranty + '}';
    }
    
    
    
}
