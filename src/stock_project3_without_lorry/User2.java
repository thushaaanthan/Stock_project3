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
class User2 {
    private String name,address,dates,chdate,bname,chnumber;
    private double cash,credit,cheque;
    private int ponumber;
    public User2(String name,String address,int ponumber,String dates,double cash,double credit,String chdate,String bname,String chnumber,double cheque)
    {
            this.name=name;
            this.address=address;
            this.dates=dates;
            this.chdate=chdate;
                this.bname=bname;
            this.chnumber=chnumber;
            this.cash=cash;
            this.credit=credit;
             this.cheque=cheque;
            this.ponumber=ponumber;
          
    }
    
    public String getName()
    {
        return name;
    }
     public String getAddress()
    {
        return address;
    }
      public double getCash()
    {
        return cash;
    }
       public double getCredit()
    {
        return credit;
    }
          public double getCheque()
    {
        return cheque;
    }
          public Integer getPhone()
    {
        return ponumber;
    }
     public String getdate()
    {
        return dates;
    }
      public String getchDate()
    {
        return chdate;
    }
       public String getBank()
    {
        return bname;
    }
      public String getchnumber()
    {
        return chnumber;
    }
       
    
}
