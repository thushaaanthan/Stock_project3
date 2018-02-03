/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock_project3_without_lorry;

/**
 *
 * @author TSA10
 */
class User {
    
 private String Item;
    private double buy_price,sell_price;
    private int quantity;
    public User(String Item,int quantity,double buy_price,double sell_price)
    {
            this.Item=Item;
            this.quantity=quantity;
            this.buy_price=buy_price;
            this.sell_price=sell_price;
          
    }
    
    public String getItem()
    {
        return Item;
    }
     public int getQuantity()
    {
        return quantity;
    }
      public double getBuy_price()
    {
        return buy_price;
    }
       public double getSell_price()
    {
        return sell_price;
    }
       
}

