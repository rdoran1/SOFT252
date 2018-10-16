/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocktracker;

import stocktracker.stockdatamodel.PhysicalStockItem;
import stocktracker.stockdatamodel.ServiceStockItem;

/**
 *
 * @author rdoran1
 */
public class StockTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhysicalStockItem objPhysicalItem = 
                new PhysicalStockItem("Snuff: A Diskworld Book by Terry Pratchet", 0);
        ServiceStockItem objVirtualItem =
                new ServiceStockItem("Wintersmith: A Diskworld eBook by Terry Pratchet");
        
        String strMessage = objPhysicalItem.getName() 
                + ", Is in Stock = " + objPhysicalItem.isInStock()
                + ", Qty in stock: " + objPhysicalItem.getQuantityInStock();
        System.out.println(strMessage);
        
        strMessage = objVirtualItem.getName()
                + ", Is in Stock = " + objVirtualItem.isInStock()
                + ", Qty in Stock: " + objVirtualItem.getQuantityInStock();
        System.out.println(strMessage);
    }
    
}
